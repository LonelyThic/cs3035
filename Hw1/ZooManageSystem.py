def print_animal_details(animal):
    print(f"Name: {animal['name']}, Species: {animal['species']}, Legs: {animal['legs']}, Habitat: {animal['habitat']}")

def classify_by_legs(legs):
    if legs == 0:
        return "No legs - Snake or Fish"
    elif legs == 2:
        return "Two legs - Bird or Human"
    elif legs == 4:
        return "Four legs - Mammal or Reptile"
    elif legs > 4:
        return "More than four legs - Insect or Spider"
    else:
        return "Unknown classification"


if __name__ == "__main__":
    animals = [
        {'name': 'Lion', 'species': 'Mammal', 'legs': 4, 'habitat': 'Grassland'},
        {'name': 'Eagle', 'species': 'Bird', 'legs': 2, 'habitat': 'Mountains'},
        {'name': 'Snake', 'species': 'Reptile', 'legs': 0, 'habitat': 'Desert'},
        {'name': 'Spider', 'species': 'Arachnid', 'legs': 8, 'habitat': 'Forest'}
    ]

    # Print details of each animal
    print("Animal Details:")
    for animal in animals:
        print_animal_details(animal)

    print("\nAnimal Classifications:")
    for animal in animals:
        classification = classify_by_legs(animal['legs'])
        print(f"{animal['name']}: {classification}")