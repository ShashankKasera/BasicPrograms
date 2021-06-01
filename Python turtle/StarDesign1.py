import turtle

sc=turtle.Screen()
sc.setup(700,700)
spiral= turtle.Turtle()
spiral.speed(10)

sc.bgcolor("white")

col=('#f4d72e','#e24540','#59bb58','#4181ee')

for i in range(50):
    spiral.pencolor(col[i%4])
    spiral.width(50-i)
    spiral.forward(i*12)
    spiral.right(144)
       
turtle.exitonclick() 