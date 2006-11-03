/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class net.sourceforge.openbabel implements net.sourceforge.openbabelConstants {
  public static String OpenDatafile(SWIGTYPE_p_std__ifstream fs, String filename) {
    return net.sourceforge.openbabelJNI.OpenDatafile(SWIGTYPE_p_std__ifstream.getCPtr(fs), filename);
  }

  public static void DoubleMultiply(long arg0, long arg1, DoubleType arg2) {
    net.sourceforge.openbabelJNI.DoubleMultiply(arg0, arg1, DoubleType.getCPtr(arg2));
  }

  public static void DoubleAdd(DoubleType arg0, long arg1) {
    net.sourceforge.openbabelJNI.DoubleAdd(DoubleType.getCPtr(arg0), arg1);
  }

  public static long DoubleModulus(DoubleType arg0, long arg1) {
    return net.sourceforge.openbabelJNI.DoubleModulus(DoubleType.getCPtr(arg0), arg1);
  }

  public static double Point2Plane(vector3 a, vector3 b, vector3 c, vector3 d) {
    return net.sourceforge.openbabelJNI.Point2Plane(vector3.getCPtr(a), vector3.getCPtr(b), vector3.getCPtr(c), vector3.getCPtr(d));
  }

  public static vector3 getVZero() {
    return new vector3(net.sourceforge.openbabelJNI.VZero_get(), false);
  }

  public static vector3 getVX() {
    return new vector3(net.sourceforge.openbabelJNI.VX_get(), false);
  }

  public static vector3 getVY() {
    return new vector3(net.sourceforge.openbabelJNI.VY_get(), false);
  }

  public static vector3 getVZ() {
    return new vector3(net.sourceforge.openbabelJNI.VZ_get(), false);
  }

  public static SWIGTYPE_p_std__string Trim(SWIGTYPE_p_std__string txt) {
    return new SWIGTYPE_p_std__string(net.sourceforge.openbabelJNI.Trim(SWIGTYPE_p_std__string.getCPtr(txt)), false);
  }

  public static long getUndefinedData() {
    return net.sourceforge.openbabelJNI.UndefinedData_get();
  }

  public static long getPairData() {
    return net.sourceforge.openbabelJNI.PairData_get();
  }

  public static long getEnergyData() {
    return net.sourceforge.openbabelJNI.EnergyData_get();
  }

  public static long getCommentData() {
    return net.sourceforge.openbabelJNI.CommentData_get();
  }

  public static long getConformerData() {
    return net.sourceforge.openbabelJNI.ConformerData_get();
  }

  public static long getExternalBondData() {
    return net.sourceforge.openbabelJNI.ExternalBondData_get();
  }

  public static long getRotamerList() {
    return net.sourceforge.openbabelJNI.RotamerList_get();
  }

  public static long getVirtualBondData() {
    return net.sourceforge.openbabelJNI.VirtualBondData_get();
  }

  public static long getRingData() {
    return net.sourceforge.openbabelJNI.RingData_get();
  }

  public static long getTorsionData() {
    return net.sourceforge.openbabelJNI.TorsionData_get();
  }

  public static long getAngleData() {
    return net.sourceforge.openbabelJNI.AngleData_get();
  }

  public static long getSerialNums() {
    return net.sourceforge.openbabelJNI.SerialNums_get();
  }

  public static long getUnitCell() {
    return net.sourceforge.openbabelJNI.UnitCell_get();
  }

  public static long getSpinData() {
    return net.sourceforge.openbabelJNI.SpinData_get();
  }

  public static long getChargeData() {
    return net.sourceforge.openbabelJNI.ChargeData_get();
  }

  public static long getSymmetryData() {
    return net.sourceforge.openbabelJNI.SymmetryData_get();
  }

  public static long getChiralData() {
    return net.sourceforge.openbabelJNI.ChiralData_get();
  }

  public static long getOccupationData() {
    return net.sourceforge.openbabelJNI.OccupationData_get();
  }

  public static long getDensityData() {
    return net.sourceforge.openbabelJNI.DensityData_get();
  }

  public static long getElectronicData() {
    return net.sourceforge.openbabelJNI.ElectronicData_get();
  }

  public static long getVibrationData() {
    return net.sourceforge.openbabelJNI.VibrationData_get();
  }

  public static long getRotationData() {
    return net.sourceforge.openbabelJNI.RotationData_get();
  }

  public static long getNuclearData() {
    return net.sourceforge.openbabelJNI.NuclearData_get();
  }

  public static long getSetData() {
    return net.sourceforge.openbabelJNI.SetData_get();
  }

  public static long getCustomData0() {
    return net.sourceforge.openbabelJNI.CustomData0_get();
  }

  public static long getCustomData1() {
    return net.sourceforge.openbabelJNI.CustomData1_get();
  }

  public static long getCustomData2() {
    return net.sourceforge.openbabelJNI.CustomData2_get();
  }

  public static long getCustomData3() {
    return net.sourceforge.openbabelJNI.CustomData3_get();
  }

  public static long getCustomData4() {
    return net.sourceforge.openbabelJNI.CustomData4_get();
  }

  public static long getCustomData5() {
    return net.sourceforge.openbabelJNI.CustomData5_get();
  }

  public static long getCustomData6() {
    return net.sourceforge.openbabelJNI.CustomData6_get();
  }

  public static long getCustomData7() {
    return net.sourceforge.openbabelJNI.CustomData7_get();
  }

  public static long getCustomData8() {
    return net.sourceforge.openbabelJNI.CustomData8_get();
  }

  public static long getCustomData9() {
    return net.sourceforge.openbabelJNI.CustomData9_get();
  }

  public static long getCustomData10() {
    return net.sourceforge.openbabelJNI.CustomData10_get();
  }

  public static long getCustomData11() {
    return net.sourceforge.openbabelJNI.CustomData11_get();
  }

  public static long getCustomData12() {
    return net.sourceforge.openbabelJNI.CustomData12_get();
  }

  public static long getCustomData13() {
    return net.sourceforge.openbabelJNI.CustomData13_get();
  }

  public static long getCustomData14() {
    return net.sourceforge.openbabelJNI.CustomData14_get();
  }

  public static long getCustomData15() {
    return net.sourceforge.openbabelJNI.CustomData15_get();
  }

  public static void setObErrorLog(OBMessageHandler value) {
    net.sourceforge.openbabelJNI.obErrorLog_set(OBMessageHandler.getCPtr(value));
  }

  public static OBMessageHandler getObErrorLog() {
    return new OBMessageHandler(net.sourceforge.openbabelJNI.obErrorLog_get(), false);
  }

  public static long getACIDIC() {
    return net.sourceforge.openbabelJNI.ACIDIC_get();
  }

  public static long getACYCLIC() {
    return net.sourceforge.openbabelJNI.ACYCLIC_get();
  }

  public static long getALIPHATIC() {
    return net.sourceforge.openbabelJNI.ALIPHATIC_get();
  }

  public static long getAROMATIC() {
    return net.sourceforge.openbabelJNI.AROMATIC_get();
  }

  public static long getBASIC() {
    return net.sourceforge.openbabelJNI.BASIC_get();
  }

  public static long getBURIED() {
    return net.sourceforge.openbabelJNI.BURIED_get();
  }

  public static long getCHARGED() {
    return net.sourceforge.openbabelJNI.CHARGED_get();
  }

  public static long getCYCLIC() {
    return net.sourceforge.openbabelJNI.CYCLIC_get();
  }

  public static long getHYDROPHOBIC() {
    return net.sourceforge.openbabelJNI.HYDROPHOBIC_get();
  }

  public static long getLARGE() {
    return net.sourceforge.openbabelJNI.LARGE_get();
  }

  public static long getMEDIUM() {
    return net.sourceforge.openbabelJNI.MEDIUM_get();
  }

  public static long getNEGATIVE() {
    return net.sourceforge.openbabelJNI.NEGATIVE_get();
  }

  public static long getNEUTRAL() {
    return net.sourceforge.openbabelJNI.NEUTRAL_get();
  }

  public static long getPOLAR() {
    return net.sourceforge.openbabelJNI.POLAR_get();
  }

  public static long getPOSITIVE() {
    return net.sourceforge.openbabelJNI.POSITIVE_get();
  }

  public static long getSMALL() {
    return net.sourceforge.openbabelJNI.SMALL_get();
  }

  public static long getSURFACE() {
    return net.sourceforge.openbabelJNI.SURFACE_get();
  }

  public static long getALPHA_CARBON() {
    return net.sourceforge.openbabelJNI.ALPHA_CARBON_get();
  }

  public static long getAMINO_BACKBONE() {
    return net.sourceforge.openbabelJNI.AMINO_BACKBONE_get();
  }

  public static long getBACKBONE() {
    return net.sourceforge.openbabelJNI.BACKBONE_get();
  }

  public static long getCYSTEINE_SULPHUR() {
    return net.sourceforge.openbabelJNI.CYSTEINE_SULPHUR_get();
  }

  public static long getLIGAND() {
    return net.sourceforge.openbabelJNI.LIGAND_get();
  }

  public static long getNUCLEIC_BACKBONE() {
    return net.sourceforge.openbabelJNI.NUCLEIC_BACKBONE_get();
  }

  public static long getSHAPELY_BACKBONE() {
    return net.sourceforge.openbabelJNI.SHAPELY_BACKBONE_get();
  }

  public static long getSHAPELY_SPECIAL() {
    return net.sourceforge.openbabelJNI.SHAPELY_SPECIAL_get();
  }

  public static long getSIDECHAIN() {
    return net.sourceforge.openbabelJNI.SIDECHAIN_get();
  }

  public static long getSUGAR_PHOSPHATE() {
    return net.sourceforge.openbabelJNI.SUGAR_PHOSPHATE_get();
  }

  public static long getALA() {
    return net.sourceforge.openbabelJNI.ALA_get();
  }

  public static long getGLY() {
    return net.sourceforge.openbabelJNI.GLY_get();
  }

  public static long getLEU() {
    return net.sourceforge.openbabelJNI.LEU_get();
  }

  public static long getSER() {
    return net.sourceforge.openbabelJNI.SER_get();
  }

  public static long getVAL() {
    return net.sourceforge.openbabelJNI.VAL_get();
  }

  public static long getTHR() {
    return net.sourceforge.openbabelJNI.THR_get();
  }

  public static long getLYS() {
    return net.sourceforge.openbabelJNI.LYS_get();
  }

  public static long getASP() {
    return net.sourceforge.openbabelJNI.ASP_get();
  }

  public static long getILE() {
    return net.sourceforge.openbabelJNI.ILE_get();
  }

  public static long getASN() {
    return net.sourceforge.openbabelJNI.ASN_get();
  }

  public static long getGLU() {
    return net.sourceforge.openbabelJNI.GLU_get();
  }

  public static long getPRO() {
    return net.sourceforge.openbabelJNI.PRO_get();
  }

  public static long getARG() {
    return net.sourceforge.openbabelJNI.ARG_get();
  }

  public static long getPHE() {
    return net.sourceforge.openbabelJNI.PHE_get();
  }

  public static long getGLN() {
    return net.sourceforge.openbabelJNI.GLN_get();
  }

  public static long getTYR() {
    return net.sourceforge.openbabelJNI.TYR_get();
  }

  public static long getHIS() {
    return net.sourceforge.openbabelJNI.HIS_get();
  }

  public static long getCYS() {
    return net.sourceforge.openbabelJNI.CYS_get();
  }

  public static long getMET() {
    return net.sourceforge.openbabelJNI.MET_get();
  }

  public static long getTRP() {
    return net.sourceforge.openbabelJNI.TRP_get();
  }

  public static long getASX() {
    return net.sourceforge.openbabelJNI.ASX_get();
  }

  public static long getGLX() {
    return net.sourceforge.openbabelJNI.GLX_get();
  }

  public static long getPCA() {
    return net.sourceforge.openbabelJNI.PCA_get();
  }

  public static long getHYP() {
    return net.sourceforge.openbabelJNI.HYP_get();
  }

  public static long getA() {
    return net.sourceforge.openbabelJNI.A_get();
  }

  public static long getC() {
    return net.sourceforge.openbabelJNI.C_get();
  }

  public static long getG() {
    return net.sourceforge.openbabelJNI.G_get();
  }

  public static long getT() {
    return net.sourceforge.openbabelJNI.T_get();
  }

  public static long getU() {
    return net.sourceforge.openbabelJNI.U_get();
  }

  public static long getUPLUS() {
    return net.sourceforge.openbabelJNI.UPLUS_get();
  }

  public static long getI() {
    return net.sourceforge.openbabelJNI.I_get();
  }

  public static long getOMC() {
    return net.sourceforge.openbabelJNI.OMC_get();
  }

  public static long getM2G() {
    return net.sourceforge.openbabelJNI.M2G_get();
  }

  public static long getOMG() {
    return net.sourceforge.openbabelJNI.OMG_get();
  }

  public static long getYG() {
    return net.sourceforge.openbabelJNI.YG_get();
  }

  public static long getH2U() {
    return net.sourceforge.openbabelJNI.H2U_get();
  }

  public static long getPSU() {
    return net.sourceforge.openbabelJNI.PSU_get();
  }

  public static long getUNK() {
    return net.sourceforge.openbabelJNI.UNK_get();
  }

  public static long getACE() {
    return net.sourceforge.openbabelJNI.ACE_get();
  }

  public static long getFOR() {
    return net.sourceforge.openbabelJNI.FOR_get();
  }

  public static long getHOH() {
    return net.sourceforge.openbabelJNI.HOH_get();
  }

  public static long getDOD() {
    return net.sourceforge.openbabelJNI.DOD_get();
  }

  public static long getSO4() {
    return net.sourceforge.openbabelJNI.SO4_get();
  }

  public static long getPO4() {
    return net.sourceforge.openbabelJNI.PO4_get();
  }

  public static long getNAD() {
    return net.sourceforge.openbabelJNI.NAD_get();
  }

  public static long getCOA() {
    return net.sourceforge.openbabelJNI.COA_get();
  }

  public static long getNAP() {
    return net.sourceforge.openbabelJNI.NAP_get();
  }

  public static long getNDP() {
    return net.sourceforge.openbabelJNI.NDP_get();
  }

  public static long getAMINO() {
    return net.sourceforge.openbabelJNI.AMINO_get();
  }

  public static long getAMINO_NUCLEO() {
    return net.sourceforge.openbabelJNI.AMINO_NUCLEO_get();
  }

  public static long getCOENZYME() {
    return net.sourceforge.openbabelJNI.COENZYME_get();
  }

  public static long getION() {
    return net.sourceforge.openbabelJNI.ION_get();
  }

  public static long getNUCLEO() {
    return net.sourceforge.openbabelJNI.NUCLEO_get();
  }

  public static long getPROTEIN() {
    return net.sourceforge.openbabelJNI.PROTEIN_get();
  }

  public static long getPURINE() {
    return net.sourceforge.openbabelJNI.PURINE_get();
  }

  public static long getPYRIMIDINE() {
    return net.sourceforge.openbabelJNI.PYRIMIDINE_get();
  }

  public static long getSOLVENT() {
    return net.sourceforge.openbabelJNI.SOLVENT_get();
  }

  public static long getWATER() {
    return net.sourceforge.openbabelJNI.WATER_get();
  }

  public static void setResidue(SWIGTYPE_p_a_4__char value) {
    net.sourceforge.openbabelJNI.Residue_set(SWIGTYPE_p_a_4__char.getCPtr(value));
  }

  public static SWIGTYPE_p_a_4__char getResidue() {
    long cPtr = net.sourceforge.openbabelJNI.Residue_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_4__char(cPtr, false);
  }

  public static void setElemDesc(SWIGTYPE_p_a_4__char value) {
    net.sourceforge.openbabelJNI.ElemDesc_set(SWIGTYPE_p_a_4__char.getCPtr(value));
  }

  public static SWIGTYPE_p_a_4__char getElemDesc() {
    long cPtr = net.sourceforge.openbabelJNI.ElemDesc_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_4__char(cPtr, false);
  }

  public static void setResNo(long value) {
    net.sourceforge.openbabelJNI.ResNo_set(value);
  }

  public static long getResNo() {
    return net.sourceforge.openbabelJNI.ResNo_get();
  }

  public static void setElemNo(long value) {
    net.sourceforge.openbabelJNI.ElemNo_set(value);
  }

  public static long getElemNo() {
    return net.sourceforge.openbabelJNI.ElemNo_get();
  }

  public static boolean tokenize(SWIGTYPE_p_std__vectorTstd__string_t arg0, String buf, String delimstr) {
    return net.sourceforge.openbabelJNI.tokenize__SWIG_0(SWIGTYPE_p_std__vectorTstd__string_t.getCPtr(arg0), buf, delimstr);
  }

  public static boolean tokenize(SWIGTYPE_p_std__vectorTstd__string_t arg0, String buf) {
    return net.sourceforge.openbabelJNI.tokenize__SWIG_1(SWIGTYPE_p_std__vectorTstd__string_t.getCPtr(arg0), buf);
  }

  public static boolean tokenize(SWIGTYPE_p_std__vectorTstd__string_t arg0, SWIGTYPE_p_std__string arg1, String delimstr, int limit) {
    return net.sourceforge.openbabelJNI.tokenize__SWIG_2(SWIGTYPE_p_std__vectorTstd__string_t.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1), delimstr, limit);
  }

  public static boolean tokenize(SWIGTYPE_p_std__vectorTstd__string_t arg0, SWIGTYPE_p_std__string arg1, String delimstr) {
    return net.sourceforge.openbabelJNI.tokenize__SWIG_3(SWIGTYPE_p_std__vectorTstd__string_t.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1), delimstr);
  }

  public static boolean tokenize(SWIGTYPE_p_std__vectorTstd__string_t arg0, SWIGTYPE_p_std__string arg1) {
    return net.sourceforge.openbabelJNI.tokenize__SWIG_4(SWIGTYPE_p_std__vectorTstd__string_t.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public static void ThrowError(SWIGTYPE_p_std__string str) {
    net.sourceforge.openbabelJNI.ThrowError__SWIG_1(SWIGTYPE_p_std__string.getCPtr(str));
  }

  public static void CartesianToInternal(SWIGTYPE_p_std__vectorTOpenBabel__OBInternalCoord_p_t arg0, OBMol arg1) {
    net.sourceforge.openbabelJNI.CartesianToInternal(SWIGTYPE_p_std__vectorTOpenBabel__OBInternalCoord_p_t.getCPtr(arg0), OBMol.getCPtr(arg1));
  }

  public static void InternalToCartesian(SWIGTYPE_p_std__vectorTOpenBabel__OBInternalCoord_p_t arg0, OBMol arg1) {
    net.sourceforge.openbabelJNI.InternalToCartesian(SWIGTYPE_p_std__vectorTOpenBabel__OBInternalCoord_p_t.getCPtr(arg0), OBMol.getCPtr(arg1));
  }

  public static String NewExtension(SWIGTYPE_p_std__string arg0, String arg1) {
    return net.sourceforge.openbabelJNI.NewExtension(SWIGTYPE_p_std__string.getCPtr(arg0), arg1);
  }

  public static void setEtab(OBElementTable value) {
    net.sourceforge.openbabelJNI.etab_set(OBElementTable.getCPtr(value));
  }

  public static OBElementTable getEtab() {
    return new OBElementTable(net.sourceforge.openbabelJNI.etab_get(), false);
  }

  public static void setTtab(OBTypeTable value) {
    net.sourceforge.openbabelJNI.ttab_set(OBTypeTable.getCPtr(value));
  }

  public static OBTypeTable getTtab() {
    return new OBTypeTable(net.sourceforge.openbabelJNI.ttab_get(), false);
  }

  public static void setIsotab(OBIsotopeTable value) {
    net.sourceforge.openbabelJNI.isotab_set(OBIsotopeTable.getCPtr(value));
  }

  public static OBIsotopeTable getIsotab() {
    return new OBIsotopeTable(net.sourceforge.openbabelJNI.isotab_get(), false);
  }

  public static void setAromtyper(OBAromaticTyper value) {
    net.sourceforge.openbabelJNI.aromtyper_set(OBAromaticTyper.getCPtr(value));
  }

  public static OBAromaticTyper getAromtyper() {
    return new OBAromaticTyper(net.sourceforge.openbabelJNI.aromtyper_get(), false);
  }

  public static void setAtomtyper(OBAtomTyper value) {
    net.sourceforge.openbabelJNI.atomtyper_set(OBAtomTyper.getCPtr(value));
  }

  public static OBAtomTyper getAtomtyper() {
    return new OBAtomTyper(net.sourceforge.openbabelJNI.atomtyper_get(), false);
  }

  public static void setChainsparser(OBChainsParser value) {
    net.sourceforge.openbabelJNI.chainsparser_set(OBChainsParser.getCPtr(value));
  }

  public static OBChainsParser getChainsparser() {
    return new OBChainsParser(net.sourceforge.openbabelJNI.chainsparser_get(), false);
  }

  public static void setResdat(OBResidueData value) {
    net.sourceforge.openbabelJNI.resdat_set(OBResidueData.getCPtr(value));
  }

  public static OBResidueData getResdat() {
    return new OBResidueData(net.sourceforge.openbabelJNI.resdat_get(), false);
  }

  public static void get_rmat(SWIGTYPE_p_double arg0, SWIGTYPE_p_double arg1, SWIGTYPE_p_double arg2, int arg3) {
    net.sourceforge.openbabelJNI.get_rmat(SWIGTYPE_p_double.getCPtr(arg0), SWIGTYPE_p_double.getCPtr(arg1), SWIGTYPE_p_double.getCPtr(arg2), arg3);
  }

  public static void ob_make_rmat(SWIGTYPE_p_a_3__double mat, SWIGTYPE_p_double rmat) {
    net.sourceforge.openbabelJNI.ob_make_rmat(SWIGTYPE_p_a_3__double.getCPtr(mat), SWIGTYPE_p_double.getCPtr(rmat));
  }

  public static void qtrfit(SWIGTYPE_p_double r, SWIGTYPE_p_double f, int size, SWIGTYPE_p_a_3__double u) {
    net.sourceforge.openbabelJNI.qtrfit(SWIGTYPE_p_double.getCPtr(r), SWIGTYPE_p_double.getCPtr(f), size, SWIGTYPE_p_a_3__double.getCPtr(u));
  }

  public static double superimpose(SWIGTYPE_p_double arg0, SWIGTYPE_p_double arg1, int arg2) {
    return net.sourceforge.openbabelJNI.superimpose(SWIGTYPE_p_double.getCPtr(arg0), SWIGTYPE_p_double.getCPtr(arg1), arg2);
  }

  public static boolean CompareRingSize(OBRing arg0, OBRing arg1) {
    return net.sourceforge.openbabelJNI.CompareRingSize(OBRing.getCPtr(arg0), OBRing.getCPtr(arg1));
  }

  public static void SmartsLexReplace(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__vectorTstd__pairTstd__string_std__string_t_t arg1) {
    net.sourceforge.openbabelJNI.SmartsLexReplace(SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__vectorTstd__pairTstd__string_std__string_t_t.getCPtr(arg1));
  }

}
