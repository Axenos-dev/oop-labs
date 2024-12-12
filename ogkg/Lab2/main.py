from PIL import Image, ImageDraw

DS_FILENAME = 'DS1.txt'
WIDTH, HEIGHT = 960, 540

def read_dataset(filename: str) -> list[tuple[int, int]]:
  points = []

  with open(filename, 'r') as f:
    for line in f:
      if line.strip():
        x_str, y_str = line.strip().split()
        x = float(x_str)
        y = float(y_str)
        points.append((x, y))
  
  return points

def draw_points(points: list[tuple[int, int]], width: int, height: int) -> Image.Image:
  img = Image.new('RGB', (width, height), (255, 255, 255))
  draw = ImageDraw.Draw(img)

  for (x, y) in points:
    draw.point((x, height - y), fill=(0, 0, 255))

  return img

def save_image(image: Image.Image, filename: str) -> None:
  image.save(filename)


if __name__ == '__main__':
  points = read_dataset(DS_FILENAME)
  img = draw_points(points, WIDTH, HEIGHT)
  save_image(img, 'output.png')
