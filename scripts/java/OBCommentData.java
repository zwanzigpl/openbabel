/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBCommentData extends OBGenericData {
  private long swigCPtr;

  protected OBCommentData(long cPtr, boolean cMemoryOwn) {
    super(net.sourceforge.openbabelJNI.SWIGOBCommentDataUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBCommentData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      net.sourceforge.openbabelJNI.delete_OBCommentData(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public OBCommentData() {
    this(net.sourceforge.openbabelJNI.new_OBCommentData__SWIG_0(), true);
  }

  public OBCommentData(OBCommentData arg0) {
    this(net.sourceforge.openbabelJNI.new_OBCommentData__SWIG_1(OBCommentData.getCPtr(arg0)), true);
  }

  public OBGenericData Clone(OBBase arg0) {
    long cPtr = net.sourceforge.openbabelJNI.OBCommentData_Clone(swigCPtr, OBBase.getCPtr(arg0));
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public void SetData(String data) {
    net.sourceforge.openbabelJNI.OBCommentData_SetData__SWIG_0(swigCPtr, data);
  }

  public String GetData() {
    return net.sourceforge.openbabelJNI.OBCommentData_GetData(swigCPtr);
  }

  public String GetValue() {
    return net.sourceforge.openbabelJNI.OBCommentData_GetValue(swigCPtr);
  }

}
