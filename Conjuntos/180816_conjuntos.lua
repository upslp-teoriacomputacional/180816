--[[
 * ----------------------------------------------------------------------
 *  Universidad Politecnica de San Luis Potosí
 *  Ingeniería en Tecnologías de Información
 *
 *  Materia: Teoría Computacional
 *  Profesor: Juan Carlos González Ibarra
 *  Nombre:    Aarón Mishael Carrizal Méndez
 *  Matricula: 180816
 *  
 *  Escrito:       06/02/21
 *  Ultima actualización:  06/02/21
 *----------------------------------------------------------------------*
]]

--Remove an item from a set
function quitar()
    setA.remove(2)
    print("The set after the removal: ",table.concat(setA, ", "))
end

--Remove all items from a set
function clearSet()
    setA = {}
    print("The set is empty: ",table.concat(setA, ", "))
end

--Copy a set
function copiar()
    setB = setA
    print("set A = ",table.concat(setA, ", ")," set B = ",table.concat(setB, ", "))
end

--Add an Item
function a()
    local lastIdx = #setB
    table.insert(setB,lastIndx,999)
    print("The new set B is = ",table.concat(setB, ", "))
end

--[[

Set Operations

]]

--Union
function union()
    local setUnion = {}
    for i = 1, #setB do
        setUnion[i] = setB[i]
    end
    for i = 1, #setA do
        table.insert(setUnion, #setUnion,setA[i])
    end
    print("After union: ", table.concat(setUnion, ", "))
end

--Intersection
function intersection()
    print("After intersection: ")
    for i = 1, #setA do
        for j = 0, #setB do
            if setA[i] == setB[i] then
                print(setA[i])
            end
        end
    end
end

--Difference
function difference()
    local lasIdx = 1
    local setDiff = {}
    for i = 1, #setA do
        flag = false
        for j = 1, #setB do
            if setA[i] == setB[i] then
                flag = true
            end
        end
        if flag == false then
            table.insert(setDiff, lasIdx,setA[i])
            lasIdx = lasIdx + 1
        end
    end
    print("After difference: ", table.concat(setDiff, ", "))
end
        




--define 3 sets
setA = {1 , 2, 3, 4, 5}
setB = {3, 4, 5, 6, 7}
setC = {}

print("The set A is: ",table.concat(setA, ", "))
print("The set B is: ",table.concat(setB, ", "))
print("The set C is: ",table.concat(setC, ", "))
union()
difference()



