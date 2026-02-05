class calcularindices :

    @staticmethod
    def calcular_imc(peso_kg, altura_metros):
        return peso_kg / (altura_metros * altura_metros)

    @staticmethod
    def calcular_porcentaje_grasa(imc, edad, es_masculino):
        valor_genero = 10.8 if es_masculino else 0
        return (1.2 * imc) + (0.23 * edad) - 5.4 - valor_genero

    @staticmethod
    def calcular_calorias_en_reposo(peso_kg, altura_cm, edad, es_masculino):
        valor_genero = 5 if es_masculino else -161
        return (10 * peso_kg) + (6.25 * altura_cm) - (5 * edad) + valor_genero

    @staticmethod
    def calcular_calorias_en_actividad(tmb, valor_actividad):
        return tmb * valor_actividad

    @staticmethod
    def consumo_recomendado_para_adelgazar(tmb_actividad):
        minimo = tmb_actividad * 0.80
        maximo = tmb_actividad * 0.85
        return minimo, maximo