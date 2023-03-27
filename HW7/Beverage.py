class Beverage:
    def __init__(self, name, price, volume):
        self._name = name
        self._price = price
        self._volume = volume

    @property
    def name(self): # getter названия
        return self._name

    @property
    def price(self): # getter цены
        return self._price

    @property
    def volume(self):  # getter объема
        return self._volume