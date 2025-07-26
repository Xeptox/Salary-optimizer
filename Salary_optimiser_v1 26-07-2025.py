#Variables data block |||||||||||||
month_20_days = float(168) #standart amount of work hours
month_21_days = float(176.5) #standart amount of work hours
month_22_days = float(185) #standart amount of work hours
month_23_days = float(193.5) #standart amount of work hours
#Variables data block||||||||||||||

#Format data block|||||||||||||||||
a = "Salary for"
b = "days month"
c = "and for"
d = "hours at day is"
#Format data block|||||||||||||||||

#Functions block|||||||||||||||||||
def work_day():
    return input("Please enter how much hours per day you prefer to work ?")

def work_pay():
    return input("Please enter your preferred per hour payment ?")

def work_overtime1():
    if 9 <= work_day <= 11:
        overtime_hours1 = work_day - 9
    else:
        overtime_hours1 = 2
    return overtime_hours1

def work_overtime2():
    if 11 <= work_day <= 12:
        overtime_hours2 = (work_day - 11)
    else:
        overtime_hours2 = 0
    return overtime_hours2

def work_overtime_pay_for_day():
    return (work_overtime1 * work_pay  * 1.25 ) + ( work_overtime2 * work_pay * 1.5 )
#Overtime work hours payment above 9 hours normal work day between 9 hours to 11 hours 125% and above 11hours 150%

def final_salary1():
    return (month_20_days * work_pay) + work_overtime_pay_for_day * 20 + (2 * work_pay * 1.25)


def final_salary2():
    return (month_21_days * work_pay) + work_overtime_pay_for_day * 21 + (2 * work_pay * 1.25)


def final_salary3():
    return (month_22_days * work_pay) + work_overtime_pay_for_day * 22 + (2 * work_pay * 1.25)


def final_salary4():
    return (month_23_days * work_pay) + work_overtime_pay_for_day * 23 + (2 * work_pay * 1.25)


def calculations_print():
    print(f"{a}", 20 ,f"{b} {c}", work_day ,f"{d}", final_salary1,"\n"
          f"{a}", 21 ,f"{b} {c}", work_day ,f"{d}", final_salary2,"\n"
          f"{a}", 22 ,f"{b} {c}", work_day ,f"{d}", final_salary3,"\n"
          f"{a}", 23 ,f"{b} {c}", work_day ,f"{d}", final_salary4 )
#Functions block|||||||||||||||||||

#Buffer block||||||||||||||||||||||
work_day = float(work_day())
work_pay = float(work_pay())
work_overtime1 = float(work_overtime1())
work_overtime2 = float(work_overtime2())
work_overtime_pay_for_day = float(work_overtime_pay_for_day())
final_salary1 = float(final_salary1())
final_salary2 = float(final_salary2())
final_salary3 = float(final_salary3())
final_salary4 = float(final_salary4())
#Buffer block||||||||||||||||||||||

#Initiation block||||||||||||||||||
calculations_print()
#Initiation block||||||||||||||||||