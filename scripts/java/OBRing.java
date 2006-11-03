/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBRing {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBRing(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBRing obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      net.sourceforge.openbabelJNI.delete_OBRing(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void set_path(vectorInt value) {
    net.sourceforge.openbabelJNI.OBRing__path_set(swigCPtr, vectorInt.getCPtr(value));
  }

  public vectorInt get_path() {
    return new vectorInt(net.sourceforge.openbabelJNI.OBRing__path_get(swigCPtr), false);
  }

  public void set_pathset(OBBitVec value) {
    net.sourceforge.openbabelJNI.OBRing__pathset_set(swigCPtr, OBBitVec.getCPtr(value));
  }

  public OBBitVec get_pathset() {
    return new OBBitVec(net.sourceforge.openbabelJNI.OBRing__pathset_get(swigCPtr), false);
  }

  public boolean findCenterAndNormal(vector3 center, vector3 norm1, vector3 norm2) {
    return net.sourceforge.openbabelJNI.OBRing_findCenterAndNormal(swigCPtr, vector3.getCPtr(center), vector3.getCPtr(norm1), vector3.getCPtr(norm2));
  }

  public OBRing() {
    this(net.sourceforge.openbabelJNI.new_OBRing__SWIG_0(), true);
  }

  public OBRing(vectorInt arg0, int arg1) {
    this(net.sourceforge.openbabelJNI.new_OBRing__SWIG_1(vectorInt.getCPtr(arg0), arg1), true);
  }

  public OBRing(OBRing src) {
    this(net.sourceforge.openbabelJNI.new_OBRing__SWIG_2(OBRing.getCPtr(src)), true);
  }

  public int Size() {
    return net.sourceforge.openbabelJNI.OBRing_Size(swigCPtr);
  }

  public int PathSize() {
    return net.sourceforge.openbabelJNI.OBRing_PathSize(swigCPtr);
  }

  public boolean IsMember(OBAtom a) {
    return net.sourceforge.openbabelJNI.OBRing_IsMember__SWIG_0(swigCPtr, OBAtom.getCPtr(a));
  }

  public boolean IsMember(OBBond b) {
    return net.sourceforge.openbabelJNI.OBRing_IsMember__SWIG_1(swigCPtr, OBBond.getCPtr(b));
  }

  public boolean IsAromatic() {
    return net.sourceforge.openbabelJNI.OBRing_IsAromatic(swigCPtr);
  }

  public boolean IsInRing(int i) {
    return net.sourceforge.openbabelJNI.OBRing_IsInRing(swigCPtr, i);
  }

  public void SetParent(OBMol m) {
    net.sourceforge.openbabelJNI.OBRing_SetParent(swigCPtr, OBMol.getCPtr(m));
  }

  public OBMol GetParent() {
    long cPtr = net.sourceforge.openbabelJNI.OBRing_GetParent(swigCPtr);
    return (cPtr == 0) ? null : new OBMol(cPtr, false);
  }

}
