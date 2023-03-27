from HotBeverage import HotBeverage


class VendingMachine:

    def button(self):
        coffee = HotBeverage("espresso", 100, 50, 90)
        tea = HotBeverage("black tea", 60, 100, 85)
        hot_chocolate = HotBeverage("hot chocolate", 160, 50, 60)

        temp = True
        while temp:
            button = input("Введите название напитка: ")
            if button == "espresso":
                print("Вы выбрали espresso")
                coffee.drink_info()
                temp = False
            elif button == "black tea":
                print("Вы выбрали black tea")
                tea.drink_info()
                temp = False
            elif button == "hot chocolate":
                print("Вы выбрали hot chocolate")
                hot_chocolate.drink_info()
                temp = False
            else:
                print("Такого напитка нет в автомате")