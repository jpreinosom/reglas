package cosmoplas.comunicacion;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Documento implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("idDocumento")
   private java.lang.Integer idDocumento;
   @org.kie.api.definition.type.Label("codBodega")
   private java.lang.String codBodega;
   @org.kie.api.definition.type.Label("idDespacho")
   private java.lang.String idDespacho;
   @org.kie.api.definition.type.Label("fechaDespecho")
   private java.util.Date fechaDespecho;
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

   @org.kie.api.definition.type.Label(value = "fechaHoy")
   private java.util.Date fechaHoy;

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

   public java.lang.String getCodBodega()
   {
      return this.codBodega;
   }

   public void setCodBodega(java.lang.String codBodega)
   {
      this.codBodega = codBodega;
   }

   public java.lang.String getIdDespacho()
   {
      return this.idDespacho;
   }

   public void setIdDespacho(java.lang.String idDespacho)
   {
      this.idDespacho = idDespacho;
   }

   public java.util.Date getFechaDespecho()
   {
      return this.fechaDespecho;
   }

   public void setFechaDespecho(java.util.Date fechaDespecho)
   {
      this.fechaDespecho = fechaDespecho;
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

   public java.util.Date getFechaHoy()
   {
      return this.fechaHoy;
   }

   public void setFechaHoy(java.util.Date fechaHoy)
   {
      this.fechaHoy = fechaHoy;
   }

   public Documento(java.lang.Integer idDocumento, java.lang.String codBodega,
         java.lang.String idDespacho, java.util.Date fechaDespecho,
         java.lang.Integer montoReservado, java.lang.Boolean esKit,
         java.lang.Integer stock, java.lang.String tipoNota,
         java.lang.Boolean respJust, java.lang.Boolean respBus,
         java.util.Date fechaHoy)
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
   }

}