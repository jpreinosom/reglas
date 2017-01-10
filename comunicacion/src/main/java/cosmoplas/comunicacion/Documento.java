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
   @org.kie.api.definition.type.Label("fechaDespecho")
   private Integer fechaDespecho;
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
   private Integer fechaHoy;

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
   private Integer fechaEmision;

   @org.kie.api.definition.type.Label("tipoPedido")
   private java.lang.Integer tipoPedido;

   @org.kie.api.definition.type.Label("valorNeto")
   private java.lang.Integer valorNeto;

   @org.kie.api.definition.type.Label("descTipoPedido")
   private java.lang.String descTipoPedido;

   @org.kie.api.definition.type.Label(value = "idBodegaAnterior")
   private java.lang.Integer idBodegaAnterior;

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

   public java.lang.Integer getFechaDespecho()
   {
      return this.fechaDespecho;
   }

   public void setFechaDespecho(java.lang.Integer fechaDespecho)
   {
      this.fechaDespecho = fechaDespecho;
   }

   public java.lang.Integer getFechaHoy()
   {
      return this.fechaHoy;
   }

   public void setFechaHoy(java.lang.Integer fechaHoy)
   {
      this.fechaHoy = fechaHoy;
   }

   public java.lang.Integer getFechaEmision()
   {
      return this.fechaEmision;
   }

   public void setFechaEmision(java.lang.Integer fechaEmision)
   {
      this.fechaEmision = fechaEmision;
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

   public Documento(java.lang.Integer idDocumento, java.lang.Integer codBodega,
         java.lang.String idDespacho, java.lang.Integer fechaDespecho,
         java.lang.Integer montoReservado, java.lang.Boolean esKit,
         java.lang.Integer stock, java.lang.String tipoNota,
         java.lang.Boolean respJust, java.lang.Boolean respBus,
         java.lang.Integer fechaHoy, java.lang.Integer diferenciaFecha,
         java.lang.Integer tipoPago, java.lang.String adicional4,
         java.lang.String adicional32, java.lang.String mensajeError,
         java.lang.Integer idLista, java.lang.Integer idTipoProducto,
         java.lang.Integer fechaEmision, java.lang.Integer tipoPedido,
         java.lang.Integer valorNeto, java.lang.String descTipoPedido,
         java.lang.Integer idBodegaAnterior)
   {
      this.idDocumento = idDocumento;
      this.codBodega = codBodega;
      this.idDespacho = idDespacho;
      this.fechaDespecho = fechaDespecho;
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
   }

}