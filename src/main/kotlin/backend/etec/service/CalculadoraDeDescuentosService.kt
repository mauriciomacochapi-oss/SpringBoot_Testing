package backend.etec.service

import org.springframework.stereotype.Service

@Service
class CalculadoraDeDescuentosService{

    fun aplicarDescuentosSegunUsuario(userID: String, monto: Double): Double {
        // La implementación real de la regla de negocio se probará en el test de integración.

        //return monto - ((monto/100)*25)

        TODO("Debe devolver el monto final tras aplicar un descuento del 25%")

    }
}
