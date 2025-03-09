/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 *
 * @author Ceci
 */
public class Cliente {
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;

    /**
     * Constructor de objeto cliente con su nombre, dni y teléfono.
     * 
     * @param nombre Nombre del cliente.
     * @param dni DNI del cliente.
     * @param telefono Teléfono del cliente.
     */
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.setNombre(nombre);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setCodigo(obtenerNumeroCliente());
    }
    
    /**
     * Devuelve el número de cliente, sumando 1 a la cantidad de clientes que había antes de que el nuevo cliente llegase.
     * 
     * @return Número del cliente.
     * 
     */
    public static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

    public String mostrarInformacion() {
        return "Código: " + getCodigo() + ", Nombre: " + getNombre() + ", DNI: " + getDni() + ", Teléfono: " + getTelefono();
    }

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
