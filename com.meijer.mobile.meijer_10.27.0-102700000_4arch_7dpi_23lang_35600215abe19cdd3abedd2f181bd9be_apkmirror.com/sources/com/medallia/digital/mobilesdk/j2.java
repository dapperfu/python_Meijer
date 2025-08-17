package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class j2 extends b0 implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    private static final int f92275B = 31;

    /* renamed from: A, reason: collision with root package name */
    private MDAppearanceMode f92276A;

    /* renamed from: a, reason: collision with root package name */
    private final String f92277a;

    /* renamed from: b, reason: collision with root package name */
    private final String f92278b;

    /* renamed from: c, reason: collision with root package name */
    private String f92279c;

    /* renamed from: d, reason: collision with root package name */
    private String f92280d;

    /* renamed from: e, reason: collision with root package name */
    private String f92281e;

    /* renamed from: f, reason: collision with root package name */
    private List<ResourceContract> f92282f;

    /* renamed from: g, reason: collision with root package name */
    private String f92283g;

    /* renamed from: h, reason: collision with root package name */
    private String f92284h;

    /* renamed from: i, reason: collision with root package name */
    private String f92285i;

    /* renamed from: j, reason: collision with root package name */
    private FormTriggerType f92286j;

    /* renamed from: k, reason: collision with root package name */
    private a f92287k;

    /* renamed from: l, reason: collision with root package name */
    private c8 f92288l;

    /* renamed from: m, reason: collision with root package name */
    private InviteData f92289m;

    /* renamed from: n, reason: collision with root package name */
    private FormViewType f92290n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f92291o;

    /* renamed from: p, reason: collision with root package name */
    private String f92292p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f92293q;

    /* renamed from: r, reason: collision with root package name */
    private r7 f92294r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f92295s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f92296t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<String> f92297u;

    /* renamed from: v, reason: collision with root package name */
    private String f92298v;

    /* renamed from: w, reason: collision with root package name */
    private String f92299w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f92300x;

    /* renamed from: y, reason: collision with root package name */
    private String f92301y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f92302z;

    protected enum a {
        NOT_EXISTS(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        AVAILABLE(3),
        FAILED(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f92309a;

        a(int i10) {
            this.f92309a = i10;
        }

        protected int a() {
            return this.f92309a;
        }

        protected static a a(int i10) {
            for (a aVar : values()) {
                if (aVar.a() == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j2(SDKConfigurationFormContract sDKConfigurationFormContract) {
        this.f92297u = new ArrayList<>();
        this.f92277a = sDKConfigurationFormContract.getFormId();
        this.f92278b = sDKConfigurationFormContract.getName();
        this.f92279c = sDKConfigurationFormContract.getFormJson().toString();
        this.f92280d = sDKConfigurationFormContract.getTemplateLocalUrl();
        this.f92281e = sDKConfigurationFormContract.getTemplateRemoteUrl();
        this.f92283g = sDKConfigurationFormContract.getTitle();
        this.f92284h = sDKConfigurationFormContract.getTitleTextColor();
        this.f92285i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.f92286j = sDKConfigurationFormContract.getFormType();
        this.f92287k = a.NOT_STARTED;
        this.f92288l = ModelFactory.getInstance().createTransitionType(this.f92279c);
        this.f92289m = sDKConfigurationFormContract.getInviteData();
        this.f92290n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.f92291o = sDKConfigurationFormContract.isPreloaded();
        this.f92292p = sDKConfigurationFormContract.getFormLanguage();
        this.f92293q = sDKConfigurationFormContract.isRtl();
        a(sDKConfigurationFormContract.getResources());
        this.f92295s = sDKConfigurationFormContract.isPoweredByVisible();
        this.f92294r = ModelFactory.getInstance().createThankYouDataObject(this.f92279c);
        m();
        this.f92298v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.f92299w = sDKConfigurationFormContract.getUrlVersion();
        this.f92301y = sDKConfigurationFormContract.getHeaderThemeName();
        this.f92302z = sDKConfigurationFormContract.isDarkModeEnabled();
    }

    private void m() {
        if (this.f92287k != null) {
            a4.b("FormId: " + this.f92277a + ", FormStatus : " + this.f92287k.name());
        }
    }

    public String a() {
        return this.f92279c;
    }

    public String b() {
        return this.f92278b;
    }

    protected a c() {
        if (this.f92287k == null) {
            this.f92287k = a.NOT_STARTED;
        }
        return this.f92287k;
    }

    public MDAppearanceMode d() {
        return this.f92276A;
    }

    public ArrayList<String> e() {
        return this.f92297u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j2 j2Var = (j2) obj;
            String str = this.f92277a;
            if (str == null ? j2Var.f92277a != null : !str.equals(j2Var.f92277a)) {
                return false;
            }
            String str2 = this.f92278b;
            if (str2 == null ? j2Var.f92278b != null : !str2.equals(j2Var.f92278b)) {
                return false;
            }
            String str3 = this.f92279c;
            if (str3 == null ? j2Var.f92279c != null : !str3.equals(j2Var.f92279c)) {
                return false;
            }
            String str4 = this.f92280d;
            if (str4 == null ? j2Var.f92280d != null : !str4.equals(j2Var.f92280d)) {
                return false;
            }
            String str5 = this.f92281e;
            if (str5 == null ? j2Var.f92281e != null : !str5.equals(j2Var.f92281e)) {
                return false;
            }
            List<ResourceContract> list = this.f92282f;
            if (list == null ? j2Var.f92282f != null : !list.equals(j2Var.f92282f)) {
                return false;
            }
            String str6 = this.f92283g;
            if (str6 == null ? j2Var.f92283g != null : !str6.equals(j2Var.f92283g)) {
                return false;
            }
            String str7 = this.f92284h;
            if (str7 == null ? j2Var.f92284h != null : !str7.equals(j2Var.f92284h)) {
                return false;
            }
            String str8 = this.f92285i;
            if (str8 == null ? j2Var.f92285i != null : !str8.equals(j2Var.f92285i)) {
                return false;
            }
            FormTriggerType formTriggerType = this.f92286j;
            if (formTriggerType == null ? j2Var.f92286j != null : !formTriggerType.equals(j2Var.f92286j)) {
                return false;
            }
            if (this.f92291o != j2Var.f92291o || this.f92295s != j2Var.f92295s) {
                return false;
            }
            r7 r7Var = this.f92294r;
            if (r7Var == null ? j2Var.f92294r != null : !r7Var.equals(j2Var.f92294r)) {
                return false;
            }
            String str9 = this.f92298v;
            if (str9 == null ? j2Var.f92298v != null : !str9.equals(j2Var.f92298v)) {
                return false;
            }
            String str10 = this.f92299w;
            if (str10 == null ? j2Var.f92299w != null : !str10.equals(j2Var.f92299w)) {
                return false;
            }
            String str11 = this.f92301y;
            if (str11 == null ? j2Var.f92301y != null : !str11.equals(j2Var.f92301y)) {
                return false;
            }
            if (this.f92302z == j2Var.f92302z && this.f92293q == j2Var.f92293q && this.f92288l == j2Var.f92288l && this.f92287k == j2Var.f92287k) {
                return true;
            }
        }
        return false;
    }

    protected List<ResourceContract> f() {
        return this.f92282f;
    }

    public String g() {
        if (this.f92280d == null) {
            this.f92280d = "";
        }
        return this.f92280d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.FormData;
    }

    protected String getFormId() {
        return this.f92277a;
    }

    protected String getFormLanguage() {
        return this.f92292p;
    }

    protected FormTriggerType getFormType() {
        return this.f92286j;
    }

    protected FormViewType getFormViewType() {
        return this.f92290n;
    }

    public String getHeaderThemeName() {
        return this.f92301y;
    }

    public InviteData getInviteData() {
        return this.f92289m;
    }

    protected String getTemplateDebugRemoteUrl() {
        if (this.f92298v == null) {
            this.f92298v = "";
        }
        return this.f92298v;
    }

    protected String getTitle() {
        return this.f92283g;
    }

    protected String getTitleBackgroundColor() {
        return this.f92285i;
    }

    protected String getTitleTextColor() {
        return this.f92284h;
    }

    protected String getUrlVersion() {
        return this.f92299w;
    }

    protected String h() {
        if (this.f92281e == null) {
            this.f92281e = "";
        }
        return this.f92281e;
    }

    public int hashCode() {
        String str = this.f92277a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92275B;
        String str2 = this.f92278b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f92275B;
        String str3 = this.f92279c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f92275B;
        String str4 = this.f92280d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f92275B;
        String str5 = this.f92281e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f92275B;
        List<ResourceContract> list = this.f92282f;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * f92275B;
        String str6 = this.f92283g;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * f92275B;
        String str7 = this.f92284h;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * f92275B;
        String str8 = this.f92285i;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * f92275B;
        FormTriggerType formTriggerType = this.f92286j;
        int iHashCode10 = (iHashCode9 + (formTriggerType != null ? formTriggerType.hashCode() : 0)) * f92275B;
        a aVar = this.f92287k;
        int iHashCode11 = (iHashCode10 + (aVar != null ? aVar.hashCode() : 0)) * f92275B;
        c8 c8Var = this.f92288l;
        int iHashCode12 = (iHashCode11 + (c8Var != null ? c8Var.hashCode() : 0)) * f92275B;
        FormViewType formViewType = this.f92290n;
        int iHashCode13 = (((((iHashCode12 + (formViewType != null ? formViewType.hashCode() : 0)) * f92275B) + Boolean.valueOf(this.f92291o).hashCode()) * f92275B) + Boolean.valueOf(this.f92295s).hashCode()) * f92275B;
        r7 r7Var = this.f92294r;
        int iHashCode14 = (iHashCode13 + (r7Var != null ? r7Var.hashCode() : 0)) * f92275B;
        String str9 = this.f92301y;
        int iHashCode15 = (((((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * f92275B) + Boolean.valueOf(this.f92302z).hashCode()) * f92275B) + Boolean.valueOf(this.f92293q).hashCode()) * f92275B;
        String str10 = this.f92298v;
        int iHashCode16 = (iHashCode15 + (str10 != null ? str10.hashCode() : 0)) * f92275B;
        String str11 = this.f92299w;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public r7 i() {
        return this.f92294r;
    }

    public boolean isDarkModeEnabled() {
        return this.f92302z;
    }

    protected boolean isPoweredByVisible() {
        return this.f92295s;
    }

    public boolean isRtl() {
        return this.f92293q;
    }

    protected c8 j() {
        c8 c8Var = this.f92288l;
        return c8Var == null ? c8.Fade : c8Var;
    }

    public boolean k() {
        return this.f92296t;
    }

    protected boolean l() {
        return this.f92291o;
    }

    protected boolean n() {
        return this.f92300x;
    }

    protected j2(String str, String str2, String str3, String str4, String str5, List<ResourceContract> list, String str6, String str7, String str8, FormTriggerType formTriggerType, a aVar, c8 c8Var, InviteData inviteData, FormViewType formViewType, boolean z10, String str9, boolean z11, boolean z12, r7 r7Var, boolean z13, ArrayList<String> arrayList, String str10, String str11, boolean z14, String str12, boolean z15) {
        this.f92297u = new ArrayList<>();
        this.f92277a = str;
        this.f92278b = str2;
        this.f92279c = str3;
        this.f92280d = str4;
        this.f92281e = str5;
        this.f92283g = str6;
        this.f92284h = str7;
        this.f92285i = str8;
        this.f92286j = formTriggerType;
        this.f92287k = aVar;
        this.f92288l = c8Var;
        this.f92289m = inviteData;
        this.f92290n = formViewType == null ? FormViewType.none : formViewType;
        this.f92291o = z10;
        this.f92292p = str9;
        this.f92293q = z11;
        this.f92294r = r7Var;
        this.f92295s = z12;
        this.f92297u = arrayList;
        this.f92296t = z13;
        this.f92298v = str10;
        this.f92299w = str11;
        this.f92300x = z14;
        this.f92301y = str12;
        this.f92302z = z15;
        a(list);
        m();
    }

    public void a(InviteData inviteData) {
        this.f92289m = inviteData;
    }

    public void b(String str) {
        this.f92292p = str;
    }

    public void c(String str) {
        this.f92280d = str;
    }

    protected void d(String str) {
        this.f92281e = str;
    }

    public void e(String str) {
        this.f92283g = str;
    }

    public void a(MDAppearanceMode mDAppearanceMode) {
        this.f92276A = mDAppearanceMode;
    }

    public void b(boolean z10) {
        this.f92295s = z10;
    }

    public void c(boolean z10) {
        this.f92293q = z10;
    }

    protected void d(boolean z10) {
        this.f92300x = z10;
    }

    protected void a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return;
        }
        this.f92283g = sDKConfigurationFormContract.getTitle();
        this.f92285i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.f92284h = sDKConfigurationFormContract.getTitleTextColor();
        this.f92279c = sDKConfigurationFormContract.getFormJson().toString();
        this.f92286j = sDKConfigurationFormContract.getFormType();
        this.f92290n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.f92288l = ModelFactory.getInstance().createTransitionType(this.f92279c);
        this.f92289m = sDKConfigurationFormContract.getInviteData();
        this.f92291o = sDKConfigurationFormContract.isPreloaded();
        this.f92292p = sDKConfigurationFormContract.getFormLanguage();
        this.f92293q = sDKConfigurationFormContract.isRtl();
        this.f92294r = ModelFactory.getInstance().createThankYouDataObject(this.f92279c);
        this.f92295s = sDKConfigurationFormContract.isPoweredByVisible();
        this.f92298v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.f92299w = sDKConfigurationFormContract.getUrlVersion();
        this.f92302z = sDKConfigurationFormContract.isDarkModeEnabled();
        this.f92301y = sDKConfigurationFormContract.getHeaderThemeName();
    }

    protected void a(a aVar) {
        this.f92287k = aVar;
        m();
    }

    public void a(r7 r7Var) {
        this.f92294r = r7Var;
    }

    public void a(String str) {
        this.f92279c = str;
    }

    public void a(ArrayList<String> arrayList) {
        this.f92297u = arrayList;
    }

    protected void a(List<ResourceContract> list) {
        this.f92282f = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ResourceContract resourceContract : list) {
            resourceContract.setFormId(this.f92277a);
            this.f92282f.add(resourceContract);
        }
    }

    public void a(boolean z10) {
        this.f92296t = z10;
    }
}
