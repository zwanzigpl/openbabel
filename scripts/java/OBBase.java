/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBBase {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      net.sourceforge.openbabelJNI.delete_OBBase(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBBase DoTransformations(SWIGTYPE_p_std__mapTstd__string_std__string_t arg0) {
    long cPtr = net.sourceforge.openbabelJNI.OBBase_DoTransformations(swigCPtr, SWIGTYPE_p_std__mapTstd__string_std__string_t.getCPtr(arg0));
    return (cPtr == 0) ? null : new OBBase(cPtr, false);
  }

  public static String ClassDescription() {
    return net.sourceforge.openbabelJNI.OBBase_ClassDescription();
  }

  public boolean HasData(String arg0) {
    return net.sourceforge.openbabelJNI.OBBase_HasData__SWIG_0(swigCPtr, arg0);
  }

  public boolean HasData(long type) {
    return net.sourceforge.openbabelJNI.OBBase_HasData__SWIG_2(swigCPtr, type);
  }

  public void DeleteData(long type) {
    net.sourceforge.openbabelJNI.OBBase_DeleteData__SWIG_0(swigCPtr, type);
  }

  public void DeleteData(OBGenericData arg0) {
    net.sourceforge.openbabelJNI.OBBase_DeleteData__SWIG_1(swigCPtr, OBGenericData.getCPtr(arg0));
  }

  public void DeleteData(vectorData arg0) {
    net.sourceforge.openbabelJNI.OBBase_DeleteData__SWIG_2(swigCPtr, vectorData.getCPtr(arg0));
  }

  public void SetData(OBGenericData d) {
    net.sourceforge.openbabelJNI.OBBase_SetData(swigCPtr, OBGenericData.getCPtr(d));
  }

  public long DataSize() {
    return net.sourceforge.openbabelJNI.OBBase_DataSize(swigCPtr);
  }

  public OBGenericData GetData(long type) {
    long cPtr = net.sourceforge.openbabelJNI.OBBase_GetData__SWIG_0(swigCPtr, type);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public OBGenericData GetData(String arg0) {
    long cPtr = net.sourceforge.openbabelJNI.OBBase_GetData__SWIG_1(swigCPtr, arg0);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public vectorData GetData() {
    return new vectorData(net.sourceforge.openbabelJNI.OBBase_GetData__SWIG_3(swigCPtr), false);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator BeginData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(net.sourceforge.openbabelJNI.OBBase_BeginData(swigCPtr), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator EndData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(net.sourceforge.openbabelJNI.OBBase_EndData(swigCPtr), true);
  }

  public OBBase() {
    this(net.sourceforge.openbabelJNI.new_OBBase(), true);
  }

}
