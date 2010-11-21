/*
 * generated by Fujaba - CodeGen2
 */
package esimenePakk;
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath


public class TopOfPile
{



   public static final String PROPERTY_NUMBER = "Number";

   @Property( name = PROPERTY_NUMBER, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private String Number;

   @Property( name = PROPERTY_NUMBER )
   public void setNumber (String value)
   {
      this.Number = value;
   }

   public TopOfPile withNumber (String value)
   {
      setNumber (value);
      return this;
   }

   @Property( name = PROPERTY_NUMBER )
   public String getNumber ()
   {
      return this.Number;
   }

   public static final String PROPERTY_SUIT = "Suit";

   @Property( name = PROPERTY_SUIT, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private boolean Suit;

   @Property( name = PROPERTY_SUIT )
   public void setSuit (boolean value)
   {
      this.Suit = value;
   }

   public TopOfPile withSuit (boolean value)
   {
      setSuit (value);
      return this;
   }

   @Property( name = PROPERTY_SUIT )
   public boolean isSuit ()
   {
      return this.Suit;
   }

   /**
    * <pre>
    *           0..n     is     0..1
    * TopOfPile ------------------------- Card
    *           is               card
    * </pre>
    */
   public static final String PROPERTY_CARD = "card";

   @Property( name = PROPERTY_CARD, partner = Card.PROPERTY_IS, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private Card card;

   @Property( name = PROPERTY_CARD )
   public boolean setCard (Card value)
   {
      boolean changed = false;

      if (this.card != value)
      {
      
         Card oldValue = this.card;
         TopOfPile source = this;
         if (this.card != null)
         {
            this.card = null;
            oldValue.removeFromIs (this);
         }
         this.card = value;

         if (value != null)
         {
            value.addToIs (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_CARD )
   public TopOfPile withCard (Card value)
   {
      setCard (value);
      return this;
   }

   public Card getCard ()
   {
      return this.card;
   }

   /**
    * <pre>
    *           0..1     has     0..1
    * TopOfPile ------------------------- MauMau
    *           pile               mauMau
    * </pre>
    */
   public static final String PROPERTY_MAU_MAU = "mauMau";

   @Property( name = PROPERTY_MAU_MAU, partner = MauMau.PROPERTY_PILE, kind = ReferenceHandler.ReferenceKind.TO_ONE,
         adornment = ReferenceHandler.Adornment.NONE)
   private MauMau mauMau;

   @Property( name = PROPERTY_MAU_MAU )
   public boolean setMauMau (MauMau value)
   {
      boolean changed = false;

      if (this.mauMau != value)
      {
      
         MauMau oldValue = this.mauMau;
         TopOfPile source = this;
         if (this.mauMau != null)
         {
            this.mauMau = null;
            oldValue.setPile (null);
         }
         this.mauMau = value;

         if (value != null)
         {
            value.setPile (this);
         }
         changed = true;
      
      }
      return changed;
   }

   @Property( name = PROPERTY_MAU_MAU )
   public TopOfPile withMauMau (MauMau value)
   {
      setMauMau (value);
      return this;
   }

   public MauMau getMauMau ()
   {
      return this.mauMau;
   }

   public void removeYou()
   {
      this.setCard (null);
      this.setMauMau (null);
   }
}


