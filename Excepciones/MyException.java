class ExcepcionIntervalo extends Exception {
    public ExcepcionIntervalo(String msg) {
        super(msg);
    }
}

public class MyException {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "A";
        String respuesta = "Hola";
        int numerador, denominador, cociente;
        try {
            cociente = calcular(str1, str2);
            respuesta = String.valueOf(cociente);
        }

        catch (ArithmeticException ex) {
            respuesta = "División entre cero";
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducido caracteres no numéricos";
        } catch (ExcepcionIntervalo ex) {
            respuesta = ex.getMessage();
        } catch (Exception ex) {
            respuesta = ex.getMessage();
        } finally {
            System.out.println("Hola");
        }
        System.out.println(respuesta);
    }

    static int calcular(String str1, String str2) throws ExcepcionIntervalo,
            NumberFormatException, ArithmeticException {
        int num = Integer.parseInt(str1);
        int den = Integer.parseInt(str2);
        if ((num > 100) || (den < -5)) {
            throw new ExcepcionIntervalo("Números fuera del intervalo");
        }

        return (num / den);
    }
}