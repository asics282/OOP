from Beverage import Beverage


class HotBeverage(Beverage):
    def __init__(self, name, price, volume, temperature):
        super().__init__(name, price, volume)
        self._temperature = temperature

    @property
    def temperature(self):
        return self._temperature

    # def sayTemperature(self):
    #     print(f"Температура напитка {Beverage.name} равна {self.temperature}")

    def drink_info(self):
        print(f'Название: {self.name} Стоимость: {self.price}. Объём: {self.volume}. Температура: {self.temperature}')