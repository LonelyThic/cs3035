class Monster:
    def __init__(self, name, size):
        self.name = name
        self.size = size

    def attack(self, location):
        print(f"{self.name} attacks {location}!")

    def __str__(self):
        return f"Monster(Name: {self.name}, Size: {self.size})"

    def __eq__(self, other):
        if isinstance(other, Monster):
            return self.name == other.name and self.size == other.size
        return False

    def __add__(self, other):
        if isinstance(other, Monster):
            new_name = self.name + other.name
            new_size = self.size + other.size
            return Monster(new_name, new_size)
        return NotImplemented


# Test code
if __name__ == "__main__":
    godzilla = Monster("Godzilla", 100)
    kong = Monster("Kong", 80)
    another_godzilla = Monster("Godzilla", 100)

    print(godzilla)
    print(kong)

    godzilla.attack("Tokyo")
    kong.attack("New York")

    print("godzilla == kong ?", godzilla == kong)
    print("godzilla == another_godzilla ?", godzilla == another_godzilla)

    fusion_monster = godzilla + kong
    print(fusion_monster)
    fusion_monster.attack("Los Angeles")