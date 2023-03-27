from HotBeverage import HotBeverage


class Service:
    def start(self):
        coffee = HotBeverage("espresso", 100, 50, 90)
        tea = HotBeverage("black tea", 60, 100, 85)
        hot_chocolate = HotBeverage("hot chocolate", 160, 50, 60)

        print("В автомате доступны следующие ГОРЯЧИЕ НАПИТКИ:")
        coffee.drink_info()
        tea.drink_info()
        hot_chocolate.drink_info()