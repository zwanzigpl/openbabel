/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBBond extends OBEdgeBase {
  private long swigCPtr;

  protected OBBond(long cPtr, boolean cMemoryOwn) {
    super(net.sourceforge.openbabelJNI.SWIGOBBondUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBBond obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      net.sourceforge.openbabelJNI.delete_OBBond(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public OBBond() {
    this(net.sourceforge.openbabelJNI.new_OBBond(), true);
  }

  public void SetIdx(int idx) {
    net.sourceforge.openbabelJNI.OBBond_SetIdx(swigCPtr, idx);
  }

  public void SetBO(int order) {
    net.sourceforge.openbabelJNI.OBBond_SetBO(swigCPtr, order);
  }

  public void SetBegin(OBAtom begin) {
    net.sourceforge.openbabelJNI.OBBond_SetBegin(swigCPtr, OBAtom.getCPtr(begin));
  }

  public void SetEnd(OBAtom end) {
    net.sourceforge.openbabelJNI.OBBond_SetEnd(swigCPtr, OBAtom.getCPtr(end));
  }

  public void SetLength(OBAtom arg0, double arg1) {
    net.sourceforge.openbabelJNI.OBBond_SetLength(swigCPtr, OBAtom.getCPtr(arg0), arg1);
  }

  public void Set(int arg0, OBAtom arg1, OBAtom arg2, int arg3, int arg4) {
    net.sourceforge.openbabelJNI.OBBond_Set(swigCPtr, arg0, OBAtom.getCPtr(arg1), OBAtom.getCPtr(arg2), arg3, arg4);
  }

  public void SetKSingle() {
    net.sourceforge.openbabelJNI.OBBond_SetKSingle(swigCPtr);
  }

  public void SetKDouble() {
    net.sourceforge.openbabelJNI.OBBond_SetKDouble(swigCPtr);
  }

  public void SetKTriple() {
    net.sourceforge.openbabelJNI.OBBond_SetKTriple(swigCPtr);
  }

  public void SetAromatic() {
    net.sourceforge.openbabelJNI.OBBond_SetAromatic(swigCPtr);
  }

  public void SetHash() {
    net.sourceforge.openbabelJNI.OBBond_SetHash(swigCPtr);
  }

  public void SetWedge() {
    net.sourceforge.openbabelJNI.OBBond_SetWedge(swigCPtr);
  }

  public void SetUp() {
    net.sourceforge.openbabelJNI.OBBond_SetUp(swigCPtr);
  }

  public void SetDown() {
    net.sourceforge.openbabelJNI.OBBond_SetDown(swigCPtr);
  }

  public void SetInRing() {
    net.sourceforge.openbabelJNI.OBBond_SetInRing(swigCPtr);
  }

  public void SetClosure() {
    net.sourceforge.openbabelJNI.OBBond_SetClosure(swigCPtr);
  }

  public void UnsetHash() {
    net.sourceforge.openbabelJNI.OBBond_UnsetHash(swigCPtr);
  }

  public void UnsetWedge() {
    net.sourceforge.openbabelJNI.OBBond_UnsetWedge(swigCPtr);
  }

  public void UnsetUp() {
    net.sourceforge.openbabelJNI.OBBond_UnsetUp(swigCPtr);
  }

  public void UnsetDown() {
    net.sourceforge.openbabelJNI.OBBond_UnsetDown(swigCPtr);
  }

  public void UnsetAromatic() {
    net.sourceforge.openbabelJNI.OBBond_UnsetAromatic(swigCPtr);
  }

  public void UnsetKekule() {
    net.sourceforge.openbabelJNI.OBBond_UnsetKekule(swigCPtr);
  }

  public long GetBO() {
    return net.sourceforge.openbabelJNI.OBBond_GetBO(swigCPtr);
  }

  public long GetBondOrder() {
    return net.sourceforge.openbabelJNI.OBBond_GetBondOrder(swigCPtr);
  }

  public long GetFlags() {
    return net.sourceforge.openbabelJNI.OBBond_GetFlags(swigCPtr);
  }

  public long GetBeginAtomIdx() {
    return net.sourceforge.openbabelJNI.OBBond_GetBeginAtomIdx(swigCPtr);
  }

  public long GetEndAtomIdx() {
    return net.sourceforge.openbabelJNI.OBBond_GetEndAtomIdx(swigCPtr);
  }

  public OBAtom GetBeginAtom() {
    long cPtr = net.sourceforge.openbabelJNI.OBBond_GetBeginAtom(swigCPtr);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetEndAtom() {
    long cPtr = net.sourceforge.openbabelJNI.OBBond_GetEndAtom(swigCPtr);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetNbrAtom(OBAtom ptr) {
    long cPtr = net.sourceforge.openbabelJNI.OBBond_GetNbrAtom(swigCPtr, OBAtom.getCPtr(ptr));
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public double GetEquibLength() {
    return net.sourceforge.openbabelJNI.OBBond_GetEquibLength(swigCPtr);
  }

  public double GetLength() {
    return net.sourceforge.openbabelJNI.OBBond_GetLength(swigCPtr);
  }

  public int GetNbrAtomIdx(OBAtom ptr) {
    return net.sourceforge.openbabelJNI.OBBond_GetNbrAtomIdx(swigCPtr, OBAtom.getCPtr(ptr));
  }

  public boolean IsAromatic() {
    return net.sourceforge.openbabelJNI.OBBond_IsAromatic(swigCPtr);
  }

  public boolean IsInRing() {
    return net.sourceforge.openbabelJNI.OBBond_IsInRing(swigCPtr);
  }

  public boolean IsRotor() {
    return net.sourceforge.openbabelJNI.OBBond_IsRotor(swigCPtr);
  }

  public boolean IsAmide() {
    return net.sourceforge.openbabelJNI.OBBond_IsAmide(swigCPtr);
  }

  public boolean IsPrimaryAmide() {
    return net.sourceforge.openbabelJNI.OBBond_IsPrimaryAmide(swigCPtr);
  }

  public boolean IsSecondaryAmide() {
    return net.sourceforge.openbabelJNI.OBBond_IsSecondaryAmide(swigCPtr);
  }

  public boolean IsEster() {
    return net.sourceforge.openbabelJNI.OBBond_IsEster(swigCPtr);
  }

  public boolean IsCarbonyl() {
    return net.sourceforge.openbabelJNI.OBBond_IsCarbonyl(swigCPtr);
  }

  public boolean IsSingle() {
    return net.sourceforge.openbabelJNI.OBBond_IsSingle(swigCPtr);
  }

  public boolean IsDouble() {
    return net.sourceforge.openbabelJNI.OBBond_IsDouble(swigCPtr);
  }

  public boolean IsTriple() {
    return net.sourceforge.openbabelJNI.OBBond_IsTriple(swigCPtr);
  }

  public boolean IsKSingle() {
    return net.sourceforge.openbabelJNI.OBBond_IsKSingle(swigCPtr);
  }

  public boolean IsKDouble() {
    return net.sourceforge.openbabelJNI.OBBond_IsKDouble(swigCPtr);
  }

  public boolean IsKTriple() {
    return net.sourceforge.openbabelJNI.OBBond_IsKTriple(swigCPtr);
  }

  public boolean IsClosure() {
    return net.sourceforge.openbabelJNI.OBBond_IsClosure(swigCPtr);
  }

  public boolean IsUp() {
    return net.sourceforge.openbabelJNI.OBBond_IsUp(swigCPtr);
  }

  public boolean IsDown() {
    return net.sourceforge.openbabelJNI.OBBond_IsDown(swigCPtr);
  }

  public boolean IsWedge() {
    return net.sourceforge.openbabelJNI.OBBond_IsWedge(swigCPtr);
  }

  public boolean IsHash() {
    return net.sourceforge.openbabelJNI.OBBond_IsHash(swigCPtr);
  }

  public boolean IsDoubleBondGeometry() {
    return net.sourceforge.openbabelJNI.OBBond_IsDoubleBondGeometry(swigCPtr);
  }

}
