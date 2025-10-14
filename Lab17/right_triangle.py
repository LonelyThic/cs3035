import math

class RightTriangle:
    def __init__(self, side1, side2, hyp=None):
        """Initializes a RightTriangle with two sides and optional hypotenuse."""
        try:
            self.side1 = float(side1)
            self.side2 = float(side2)
            self.hyp = float(hyp) if hyp is not None else None
        except ValueError:
            raise ValueError("Error: all side lengths must be numeric values.")
        
        if self.side1 < 0 or self.side2 < 0 or (self.hyp is not None and self.hyp < 0):
            raise ValueError("Error: both sides and the hypotenuse must be nonnegative.")
        
        if self.hyp is None:
            self.hyp = math.sqrt(self.side1 ** 2 + self.side2 ** 2)
        else:
            if abs((self.side1 ** 2 + self.side2 ** 2) - self.hyp ** 2) > 0.0001:
                raise ValueError("Error: sides do not form a valid Pythagorean triple.")
    
    def __eq__(self, other):
        """Checks if two right triangles are approximately equal."""
        if not isinstance(other, RightTriangle):
            return False
        
        if abs(self.hyp - other.hyp) > 0.0001:
            return False
        
        sides_close_direct = abs(self.side1 - other.side1) <= 0.0001 and abs(self.side2 - other.side2) <= 0.0001
        sides_close_swapped = abs(self.side1 - other.side2) <= 0.0001 and abs(self.side2 - other.side1) <= 0.0001
        
        return sides_close_direct or sides_close_swapped
    
    def __str__(self):
        """Returns a nicely formatted string for the triangle."""
        return f"Right Triangle with side a = {self.side1:.2f}, side b = {self.side2:.2f}, and hypotenuse = {self.hyp:.2f}"