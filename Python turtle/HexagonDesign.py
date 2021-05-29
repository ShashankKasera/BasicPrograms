import turtle

col=('red','yellow','green','cyan','blue',
'white')

t=turtle.Turtle()

screen=turtle.Screen()
screen.bgcolor('black')
t.speed(0)

for i in range (150):

    t.color(col[i%6])
    t.forward(i*2)
    t.left(59)
    t.width(3)

turtle.exitonclick()    