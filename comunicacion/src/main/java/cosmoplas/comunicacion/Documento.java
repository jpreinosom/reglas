package cosmoplas.comunicacion;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Documento implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("idDocumento")
   private java.lang.Integer idDocumento;
   @org.kie.api.definition.type.Label("codBodega")
   private Integer codBodega;
   @org.kie.api.definition.type.Label("idDespacho")
   private java.lang.String idDespacho;
   @org.kie.api.definition.type.Label("montoReservado")
   private java.lang.Integer montoReservado;
   @org.kie.api.definition.type.Label("esKit")
   private java.lang.Boolean esKit;
   @org.kie.api.definition.type.Label("stock")
   private java.lang.Integer stock;
   @org.kie.api.definition.type.Label("tipoNota")
   private java.lang.String tipoNota;
   @org.kie.api.definition.type.Label("respJust")
   private java.lang.Boolean respJust;

   @org.kie.api.definition.type.Label("respBus")
   private java.lang.Boolean respBus;

   @org.kie.api.definition.type.Label("fechaHoy")
   private Date fechaHoy;

   @org.kie.api.definition.type.Label("diferenciaFecha")
   private java.lang.Integer diferenciaFecha;

   @org.kie.api.definition.type.Label("tipoPago")
   private java.lang.Integer tipoPago;

   @org.kie.api.definition.type.Label("adicional4")
   private java.lang.String adicional4;

   @org.kie.api.definition.type.Label("adicional32")
   private java.lang.String adicional32;

   @org.kie.api.definition.type.Label("mensajeError")
   private java.lang.String mensajeError;

   @org.kie.api.definition.type.Label("idLista")
   private java.lang.Integer idLista;

   @org.kie.api.definition.type.Label("idTipoProducto")
   private java.lang.Integer idTipoProducto;

   @org.kie.api.definition.type.Label("fechaEmision")
   private Date fechaEmision;

   @org.kie.api.definition.type.Label("tipoPedido")
   private java.lang.Integer tipoPedido;

   @org.kie.api.definition.type.Label("valorNeto")
   private java.lang.Integer valorNeto;

   @org.kie.api.definition.type.Label("descTipoPedido")
   private java.lang.String descTipoPedido;

   @org.kie.api.definition.type.Label("idBodegaAnterior")
   private java.lang.Integer idBodegaAnterior;

   @org.kie.api.definition.type.Label("tipoTrx")
   private java.lang.String tipoTrx;

   @org.kie.api.definition.type.Label("cantidadAjusteBloqueo")
   private java.lang.Integer cantidadAjusteBloqueo;

   @org.kie.api.definition.type.Label("tipoDocumento")
   private java.lang.String tipoDocumento;

   @org.kie.api.definition.type.Label("fechaDespacho")
   private Date fechaDespacho;

   @org.kie.api.definition.type.Label("disponible")
   private java.lang.Integer disponible;

   @org.kie.api.definition.type.Label("cantidadVenta")
   private java.lang.Integer cantidadVenta;

   @org.kie.api.definition.type.Label("diffCantVenta")
   private java.lang.Integer diffCantVenta;

   @org.kie.api.definition.type.Label("formaPago")
   private java.lang.String formaPago;

   @org.kie.api.definition.type.Label("tipoEntrega")
   private java.lang.String tipoEntrega;

   @org.kie.api.definition.type.Label("transportista")
   private java.lang.String transportista;

   @org.kie.api.definition.type.Label("montoVenta")
   private java.lang.Integer montoVenta;

   @org.kie.api.definition.type.Label("valorSeguro")
   private java.lang.Integer valorSeguro;

   @org.kie.api.definition.type.Label("saldoCte")
   private java.lang.Integer saldoCte;

   @org.kie.api.definition.type.Label("rol")
   private java.lang.String rol;

   @org.kie.api.definition.type.Label("idDocOrigen")
   private java.lang.Integer idDocOrigen;

   @org.kie.api.definition.type.Label("sucursal")
   private java.lang.Integer sucursal;

   @org.kie.api.definition.type.Label("codBodegaDestino")
   private java.lang.Integer codBodegaDestino;

   @org.kie.api.definition.type.Label("pasoWMS")
   private java.lang.Boolean pasoWMS;

   @org.kie.api.definition.type.Label("documentoHijo")
   private java.lang.Boolean documentoHijo;

   @org.kie.api.definition.type.Label(value = "calculoWMS")
   private java.lang.Integer calculoWMS;

   public Documento()
   {
   }

   public java.lang.Integer getIdDocumento()
   {
      return this.idDocumento;
   }

   public void setIdDocumento(java.lang.Integer idDocumento)
   {
      this.idDocumento = idDocumento;
   }

   public java.lang.String getIdDespacho()
   {
      return this.idDespacho;
   }

   public void setIdDespacho(java.lang.String idDespacho)
   {
      this.idDespacho = idDespacho;
   }

   public java.lang.Integer getMontoReservado()
   {
      return this.montoReservado;
   }

   public void setMontoReservado(java.lang.Integer montoReservado)
   {
      this.montoReservado = montoReservado;
   }

   public java.lang.Boolean getEsKit()
   {
      return this.esKit;
   }

   public void setEsKit(java.lang.Boolean esKit)
   {
      this.esKit = esKit;
   }

   public java.lang.Integer getStock()
   {
      return this.stock;
   }

   public void setStock(java.lang.Integer stock)
   {
      this.stock = stock;
   }

   public java.lang.String getTipoNota()
   {
      return this.tipoNota;
   }

   public void setTipoNota(java.lang.String tipoNota)
   {
      this.tipoNota = tipoNota;
   }

   public java.lang.Boolean getRespJust()
   {
      return this.respJust;
   }

   public void setRespJust(java.lang.Boolean respJust)
   {
      this.respJust = respJust;
   }

   public java.lang.Boolean getRespBus()
   {
      return this.respBus;
   }

   public void setRespBus(java.lang.Boolean respBus)
   {
      this.respBus = respBus;
   }

   public java.lang.Integer getDiferenciaFecha()
   {
      return this.diferenciaFecha;
   }

   public void setDiferenciaFecha(java.lang.Integer diferenciaFecha)
   {
      this.diferenciaFecha = diferenciaFecha;
   }

   public java.lang.Integer getTipoPago()
   {
      return this.tipoPago;
   }

   public void setTipoPago(java.lang.Integer tipoPago)
   {
      this.tipoPago = tipoPago;
   }

   public java.lang.String getAdicional4()
   {
      return this.adicional4;
   }

   public void setAdicional4(java.lang.String adicional4)
   {
      this.adicional4 = adicional4;
   }

   public java.lang.String getAdicional32()
   {
      return this.adicional32;
   }

   public void setAdicional32(java.lang.String adicional32)
   {
      this.adicional32 = adicional32;
   }

   public java.lang.String getMensajeError()
   {
      return this.mensajeError;
   }

   public void setMensajeError(java.lang.String mensajeError)
   {
      this.mensajeError = mensajeError;
   }

   public java.lang.Integer getIdLista()
   {
      return this.idLista;
   }

   public void setIdLista(java.lang.Integer idLista)
   {
      this.idLista = idLista;
   }

   public java.lang.Integer getIdTipoProducto()
   {
      return this.idTipoProducto;
   }

   public void setIdTipoProducto(java.lang.Integer idTipoProducto)
   {
      this.idTipoProducto = idTipoProducto;
   }

   public java.lang.Integer getTipoPedido()
   {
      return this.tipoPedido;
   }

   public void setTipoPedido(java.lang.Integer tipoPedido)
   {
      this.tipoPedido = tipoPedido;
   }

   public java.lang.Integer getValorNeto()
   {
      return this.valorNeto;
   }

   public void setValorNeto(java.lang.Integer valorNeto)
   {
      this.valorNeto = valorNeto;
   }

   public java.lang.String getDescTipoPedido()
   {
      return this.descTipoPedido;
   }

   public void setDescTipoPedido(java.lang.String descTipoPedido)
   {
      this.descTipoPedido = descTipoPedido;
   }

   public java.lang.Integer getCodBodega()
   {
      return this.codBodega;
   }

   public void setCodBodega(java.lang.Integer codBodega)
   {
      this.codBodega = codBodega;
   }

   public java.lang.Integer getIdBodegaAnterior()
   {
      return this.idBodegaAnterior;
   }

   public void setIdBodegaAnterior(java.lang.Integer idBodegaAnterior)
   {
      this.idBodegaAnterior = idBodegaAnterior;
   }

   public java.lang.String getTipoTrx()
   {
      return this.tipoTrx;
   }

   public void setTipoTrx(java.lang.String tipoTrx)
   {
      this.tipoTrx = tipoTrx;
   }

   public java.lang.Integer getCantidadAjusteBloqueo()
   {
      return this.cantidadAjusteBloqueo;
   }

   public void setCantidadAjusteBloqueo(java.lang.Integer cantidadAjusteBloqueo)
   {
      this.cantidadAjusteBloqueo = cantidadAjusteBloqueo;
   }

   public java.lang.String getTipoDocumento()
   {
      return this.tipoDocumento;
   }

   public void setTipoDocumento(java.lang.String tipoDocumento)
   {
      this.tipoDocumento = tipoDocumento;
   }

   public java.util.Date getFechaDespacho()
   {
      return this.fechaDespacho;
   }

   public void setFechaDespacho(java.util.Date fechaDespacho)
   {
      this.fechaDespacho = fechaDespacho;
   }

   public java.util.Date getFechaEmision()
   {
      return this.fechaEmision;
   }

   public void setFechaEmision(java.util.Date fechaEmision)
   {
      this.fechaEmision = fechaEmision;
   }

   public java.util.Date getFechaHoy()
   {
      return this.fechaHoy;
   }

   public void setFechaHoy(java.util.Date fechaHoy)
   {
      this.fechaHoy = fechaHoy;
   }

   public java.lang.Integer getDisponible()
   {
      return this.disponible;
   }

   public void setDisponible(java.lang.Integer disponible)
   {
      this.disponible = disponible;
   }

   public java.lang.Integer getCantidadVenta()
   {
      return this.cantidadVenta;
   }

   public void setCantidadVenta(java.lang.Integer cantidadVenta)
   {
      this.cantidadVenta = cantidadVenta;
   }

   public java.lang.Integer getDiffCantVenta()
   {
      return this.diffCantVenta;
   }

   public void setDiffCantVenta(java.lang.Integer diffCantVenta)
   {
      this.diffCantVenta = diffCantVenta;
   }

   public java.lang.String getFormaPago()
   {
      return this.formaPago;
   }

   public void setFormaPago(java.lang.String formaPago)
   {
      this.formaPago = formaPago;
   }

   public java.lang.String getTipoEntrega()
   {
      return this.tipoEntrega;
   }

   public void setTipoEntrega(java.lang.String tipoEntrega)
   {
      this.tipoEntrega = tipoEntrega;
   }

   public java.lang.String getTransportista()
   {
      return this.transportista;
   }

   public void setTransportista(java.lang.String transportista)
   {
      this.transportista = transportista;
   }

   public java.lang.Integer getMontoVenta()
   {
      return this.montoVenta;
   }

   public void setMontoVenta(java.lang.Integer montoVenta)
   {
      this.montoVenta = montoVenta;
   }

   public java.lang.Integer getValorSeguro()
   {
      return this.valorSeguro;
   }

   public void setValorSeguro(java.lang.Integer valorSeguro)
   {
      this.valorSeguro = valorSeguro;
   }

   public java.lang.Integer getSaldoCte()
   {
      return this.saldoCte;
   }

   public void setSaldoCte(java.lang.Integer saldoCte)
   {
      this.saldoCte = saldoCte;
   }

   public java.lang.String getRol()
   {
      return this.rol;
   }

   public void setRol(java.lang.String rol)
   {
      this.rol = rol;
   }

   public java.lang.Integer getIdDocOrigen()
   {
      return this.idDocOrigen;
   }

   public void setIdDocOrigen(java.lang.Integer idDocOrigen)
   {
      this.idDocOrigen = idDocOrigen;
   }

   public java.lang.Integer getSucursal()
   {
      return this.sucursal;
   }

   public void setSucursal(java.lang.Integer sucursal)
   {
      this.sucursal = sucursal;
   }

   public java.lang.Integer getCodBodegaDestino()
   {
      return this.codBodegaDestino;
   }

   public void setCodBodegaDestino(java.lang.Integer codBodegaDestino)
   {
      this.codBodegaDestino = codBodegaDestino;
   }

   public java.lang.Boolean getPasoWMS()
   {
      return this.pasoWMS;
   }

   public void setPasoWMS(java.lang.Boolean pasoWMS)
   {
      this.pasoWMS = pasoWMS;
   }

   public java.lang.Boolean getDocumentoHijo()
   {
      return this.documentoHijo;
   }

   public void setDocumentoHijo(java.lang.Boolean documentoHijo)
   {
      this.documentoHijo = documentoHijo;
   }

   public java.lang.Integer getCalculoWMS()
   {
      return this.calculoWMS;
   }

   public void setCalculoWMS(java.lang.Integer calculoWMS)
   {
      this.calculoWMS = calculoWMS;
   }

   public Documento(java.lang.Integer idDocumento, java.lang.Integer codBodega,
         java.lang.String idDespacho, java.lang.Integer montoReservado,
         java.lang.Boolean esKit, java.lang.Integer stock,
         java.lang.String tipoNota, java.lang.Boolean respJust,
         java.lang.Boolean respBus, java.util.Date fechaHoy,
         java.lang.Integer diferenciaFecha, java.lang.Integer tipoPago,
         java.lang.String adicional4, java.lang.String adicional32,
         java.lang.String mensajeError, java.lang.Integer idLista,
         java.lang.Integer idTipoProducto, java.util.Date fechaEmision,
         java.lang.Integer tipoPedido, java.lang.Integer valorNeto,
         java.lang.String descTipoPedido, java.lang.Integer idBodegaAnterior,
         java.lang.String tipoTrx, java.lang.Integer cantidadAjusteBloqueo,
         java.lang.String tipoDocumento, java.util.Date fechaDespacho,
         java.lang.Integer disponible, java.lang.Integer cantidadVenta,
         java.lang.Integer diffCantVenta, java.lang.String formaPago,
         java.lang.String tipoEntrega, java.lang.String transportista,
         java.lang.Integer montoVenta, java.lang.Integer valorSeguro,
         java.lang.Integer saldoCte, java.lang.String rol,
         java.lang.Integer idDocOrigen, java.lang.Integer sucursal,
         java.lang.Integer codBodegaDestino, java.lang.Boolean pasoWMS,
         java.lang.Boolean documentoHijo, java.lang.Integer calculoWMS)
   {
      this.idDocumento = idDocumento;
      this.codBodega = codBodega;
      this.idDespacho = idDespacho;
      this.montoReservado = montoReservado;
      this.esKit = esKit;
      this.stock = stock;
      this.tipoNota = tipoNota;
      this.respJust = respJust;
      this.respBus = respBus;
      this.fechaHoy = fechaHoy;
      this.diferenciaFecha = diferenciaFecha;
      this.tipoPago = tipoPago;
      this.adicional4 = adicional4;
      this.adicional32 = adicional32;
      this.mensajeError = mensajeError;
      this.idLista = idLista;
      this.idTipoProducto = idTipoProducto;
      this.fechaEmision = fechaEmision;
      this.tipoPedido = tipoPedido;
      this.valorNeto = valorNeto;
      this.descTipoPedido = descTipoPedido;
      this.idBodegaAnterior = idBodegaAnterior;
      this.tipoTrx = tipoTrx;
      this.cantidadAjusteBloqueo = cantidadAjusteBloqueo;
      this.tipoDocumento = tipoDocumento;
      this.fechaDespacho = fechaDespacho;
      this.disponible = disponible;
      this.cantidadVenta = cantidadVenta;
      this.diffCantVenta = diffCantVenta;
      this.formaPago = formaPago;
      this.tipoEntrega = tipoEntrega;
      this.transportista = transportista;
      this.montoVenta = montoVenta;
      this.valorSeguro = valorSeguro;
      this.saldoCte = saldoCte;
      this.rol = rol;
      this.idDocOrigen = idDocOrigen;
      this.sucursal = sucursal;
      this.codBodegaDestino = codBodegaDestino;
      this.pasoWMS = pasoWMS;
      this.documentoHijo = documentoHijo;
      this.calculoWMS = calculoWMS;
   }

}