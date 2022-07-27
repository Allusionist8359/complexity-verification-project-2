package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class Cal extends Stm {
  public final ListCommaIdentList listcommaidentlist_;
  public final String ident_;
  public final ListCommaExpList listcommaexplist_;
  public Cal(ListCommaIdentList p1, String p2, ListCommaExpList p3) { listcommaidentlist_ = p1; ident_ = p2; listcommaexplist_ = p3; }

  public <R,A> R accept(soottocfg.ast.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.Cal) {
      soottocfg.ast.Absyn.Cal x = (soottocfg.ast.Absyn.Cal)o;
      return this.listcommaidentlist_.equals(x.listcommaidentlist_) && this.ident_.equals(x.ident_) && this.listcommaexplist_.equals(x.listcommaexplist_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.listcommaidentlist_.hashCode())+this.ident_.hashCode())+this.listcommaexplist_.hashCode();
  }


}