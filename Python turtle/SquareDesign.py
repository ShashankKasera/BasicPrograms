import turtle

sc=turtle.Screen()
sc.setup(800,700)
t= turtle.Turtle()
t.speed(10)

sc.bgcolor("white")

col=('#f4d72e','#e24540','#59bb58','#4181ee')

for i in range(25):
    t.pencolor(col[i%4])
    t.width(25-i)
    t.circle(100,steps=4)
    t.forward(i*10)
    t.right(90)
       
turtle.exitonclick() 