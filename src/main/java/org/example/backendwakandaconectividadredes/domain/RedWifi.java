package org.example.backendwakandaconectividadredes.domain;

public class RedWifi {
    private Long id;
    private String nombre;
    private String bandaAncha;
    private boolean estadoEncendida;
    private String proveedor;
    private int numeroDeUsuarios;
    private Ubicacion ubicacion;
    private ConfiguracionRed configuracionRed;
    private ProveedorInternet proveedorInternet;

    // Constructor
    public RedWifi(Long id, String nombre, String bandaAncha, boolean estadoEncendida, String proveedor, int numeroDeUsuarios, Ubicacion ubicacion, ConfiguracionRed configuracionRed, ProveedorInternet proveedorInternet) {
        this.id = id;
        this.nombre = nombre;
        this.bandaAncha = bandaAncha;
        this.estadoEncendida = estadoEncendida;
        this.proveedor = proveedor;
        this.numeroDeUsuarios = numeroDeUsuarios;
        this.ubicacion = ubicacion;
        this.configuracionRed = configuracionRed;
        this.proveedorInternet = proveedorInternet;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBandaAncha() {
        return bandaAncha;
    }

    public void setBandaAncha(String bandaAncha) {
        this.bandaAncha = bandaAncha;
    }

    public boolean isEstadoEncendida() {
        return estadoEncendida;
    }

    public void setEstadoEncendida(boolean estadoEncendida) {
        this.estadoEncendida = estadoEncendida;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public void setNumeroDeUsuarios(int numeroDeUsuarios) {
        this.numeroDeUsuarios = numeroDeUsuarios;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ConfiguracionRed getConfiguracionRed() {
        return configuracionRed;
    }

    public void setConfiguracionRed(ConfiguracionRed configuracionRed) {
        this.configuracionRed = configuracionRed;
    }

    public ProveedorInternet getProveedorInternet() {
        return proveedorInternet;
    }

    public void setProveedorInternet(ProveedorInternet proveedorInternet) {
        this.proveedorInternet = proveedorInternet;
    }
}