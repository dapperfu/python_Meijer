package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class j2 extends b0 implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    private static final int f93114B = 31;

    /* renamed from: A, reason: collision with root package name */
    private MDAppearanceMode f93115A;

    /* renamed from: a, reason: collision with root package name */
    private final String f93116a;

    /* renamed from: b, reason: collision with root package name */
    private final String f93117b;

    /* renamed from: c, reason: collision with root package name */
    private String f93118c;

    /* renamed from: d, reason: collision with root package name */
    private String f93119d;

    /* renamed from: e, reason: collision with root package name */
    private String f93120e;

    /* renamed from: f, reason: collision with root package name */
    private List<ResourceContract> f93121f;

    /* renamed from: g, reason: collision with root package name */
    private String f93122g;

    /* renamed from: h, reason: collision with root package name */
    private String f93123h;

    /* renamed from: i, reason: collision with root package name */
    private String f93124i;

    /* renamed from: j, reason: collision with root package name */
    private FormTriggerType f93125j;

    /* renamed from: k, reason: collision with root package name */
    private a f93126k;

    /* renamed from: l, reason: collision with root package name */
    private c8 f93127l;

    /* renamed from: m, reason: collision with root package name */
    private InviteData f93128m;

    /* renamed from: n, reason: collision with root package name */
    private FormViewType f93129n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f93130o;

    /* renamed from: p, reason: collision with root package name */
    private String f93131p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f93132q;

    /* renamed from: r, reason: collision with root package name */
    private r7 f93133r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f93134s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f93135t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<String> f93136u;

    /* renamed from: v, reason: collision with root package name */
    private String f93137v;

    /* renamed from: w, reason: collision with root package name */
    private String f93138w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f93139x;

    /* renamed from: y, reason: collision with root package name */
    private String f93140y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f93141z;

    protected enum a {
        NOT_EXISTS(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        AVAILABLE(3),
        FAILED(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f93148a;

        a(int i10) {
            this.f93148a = i10;
        }

        protected int a() {
            return this.f93148a;
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
        this.f93136u = new ArrayList<>();
        this.f93116a = sDKConfigurationFormContract.getFormId();
        this.f93117b = sDKConfigurationFormContract.getName();
        this.f93118c = sDKConfigurationFormContract.getFormJson().toString();
        this.f93119d = sDKConfigurationFormContract.getTemplateLocalUrl();
        this.f93120e = sDKConfigurationFormContract.getTemplateRemoteUrl();
        this.f93122g = sDKConfigurationFormContract.getTitle();
        this.f93123h = sDKConfigurationFormContract.getTitleTextColor();
        this.f93124i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.f93125j = sDKConfigurationFormContract.getFormType();
        this.f93126k = a.NOT_STARTED;
        this.f93127l = ModelFactory.getInstance().createTransitionType(this.f93118c);
        this.f93128m = sDKConfigurationFormContract.getInviteData();
        this.f93129n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.f93130o = sDKConfigurationFormContract.isPreloaded();
        this.f93131p = sDKConfigurationFormContract.getFormLanguage();
        this.f93132q = sDKConfigurationFormContract.isRtl();
        a(sDKConfigurationFormContract.getResources());
        this.f93134s = sDKConfigurationFormContract.isPoweredByVisible();
        this.f93133r = ModelFactory.getInstance().createThankYouDataObject(this.f93118c);
        m();
        this.f93137v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.f93138w = sDKConfigurationFormContract.getUrlVersion();
        this.f93140y = sDKConfigurationFormContract.getHeaderThemeName();
        this.f93141z = sDKConfigurationFormContract.isDarkModeEnabled();
    }

    private void m() {
        if (this.f93126k != null) {
            a4.b("FormId: " + this.f93116a + ", FormStatus : " + this.f93126k.name());
        }
    }

    public String a() {
        return this.f93118c;
    }

    public String b() {
        return this.f93117b;
    }

    protected a c() {
        if (this.f93126k == null) {
            this.f93126k = a.NOT_STARTED;
        }
        return this.f93126k;
    }

    public MDAppearanceMode d() {
        return this.f93115A;
    }

    public ArrayList<String> e() {
        return this.f93136u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j2 j2Var = (j2) obj;
            String str = this.f93116a;
            if (str == null ? j2Var.f93116a != null : !str.equals(j2Var.f93116a)) {
                return false;
            }
            String str2 = this.f93117b;
            if (str2 == null ? j2Var.f93117b != null : !str2.equals(j2Var.f93117b)) {
                return false;
            }
            String str3 = this.f93118c;
            if (str3 == null ? j2Var.f93118c != null : !str3.equals(j2Var.f93118c)) {
                return false;
            }
            String str4 = this.f93119d;
            if (str4 == null ? j2Var.f93119d != null : !str4.equals(j2Var.f93119d)) {
                return false;
            }
            String str5 = this.f93120e;
            if (str5 == null ? j2Var.f93120e != null : !str5.equals(j2Var.f93120e)) {
                return false;
            }
            List<ResourceContract> list = this.f93121f;
            if (list == null ? j2Var.f93121f != null : !list.equals(j2Var.f93121f)) {
                return false;
            }
            String str6 = this.f93122g;
            if (str6 == null ? j2Var.f93122g != null : !str6.equals(j2Var.f93122g)) {
                return false;
            }
            String str7 = this.f93123h;
            if (str7 == null ? j2Var.f93123h != null : !str7.equals(j2Var.f93123h)) {
                return false;
            }
            String str8 = this.f93124i;
            if (str8 == null ? j2Var.f93124i != null : !str8.equals(j2Var.f93124i)) {
                return false;
            }
            FormTriggerType formTriggerType = this.f93125j;
            if (formTriggerType == null ? j2Var.f93125j != null : !formTriggerType.equals(j2Var.f93125j)) {
                return false;
            }
            if (this.f93130o != j2Var.f93130o || this.f93134s != j2Var.f93134s) {
                return false;
            }
            r7 r7Var = this.f93133r;
            if (r7Var == null ? j2Var.f93133r != null : !r7Var.equals(j2Var.f93133r)) {
                return false;
            }
            String str9 = this.f93137v;
            if (str9 == null ? j2Var.f93137v != null : !str9.equals(j2Var.f93137v)) {
                return false;
            }
            String str10 = this.f93138w;
            if (str10 == null ? j2Var.f93138w != null : !str10.equals(j2Var.f93138w)) {
                return false;
            }
            String str11 = this.f93140y;
            if (str11 == null ? j2Var.f93140y != null : !str11.equals(j2Var.f93140y)) {
                return false;
            }
            if (this.f93141z == j2Var.f93141z && this.f93132q == j2Var.f93132q && this.f93127l == j2Var.f93127l && this.f93126k == j2Var.f93126k) {
                return true;
            }
        }
        return false;
    }

    protected List<ResourceContract> f() {
        return this.f93121f;
    }

    public String g() {
        if (this.f93119d == null) {
            this.f93119d = "";
        }
        return this.f93119d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.FormData;
    }

    protected String getFormId() {
        return this.f93116a;
    }

    protected String getFormLanguage() {
        return this.f93131p;
    }

    protected FormTriggerType getFormType() {
        return this.f93125j;
    }

    protected FormViewType getFormViewType() {
        return this.f93129n;
    }

    public String getHeaderThemeName() {
        return this.f93140y;
    }

    public InviteData getInviteData() {
        return this.f93128m;
    }

    protected String getTemplateDebugRemoteUrl() {
        if (this.f93137v == null) {
            this.f93137v = "";
        }
        return this.f93137v;
    }

    protected String getTitle() {
        return this.f93122g;
    }

    protected String getTitleBackgroundColor() {
        return this.f93124i;
    }

    protected String getTitleTextColor() {
        return this.f93123h;
    }

    protected String getUrlVersion() {
        return this.f93138w;
    }

    protected String h() {
        if (this.f93120e == null) {
            this.f93120e = "";
        }
        return this.f93120e;
    }

    public int hashCode() {
        String str = this.f93116a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f93114B;
        String str2 = this.f93117b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f93114B;
        String str3 = this.f93118c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f93114B;
        String str4 = this.f93119d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f93114B;
        String str5 = this.f93120e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f93114B;
        List<ResourceContract> list = this.f93121f;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * f93114B;
        String str6 = this.f93122g;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * f93114B;
        String str7 = this.f93123h;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * f93114B;
        String str8 = this.f93124i;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * f93114B;
        FormTriggerType formTriggerType = this.f93125j;
        int iHashCode10 = (iHashCode9 + (formTriggerType != null ? formTriggerType.hashCode() : 0)) * f93114B;
        a aVar = this.f93126k;
        int iHashCode11 = (iHashCode10 + (aVar != null ? aVar.hashCode() : 0)) * f93114B;
        c8 c8Var = this.f93127l;
        int iHashCode12 = (iHashCode11 + (c8Var != null ? c8Var.hashCode() : 0)) * f93114B;
        FormViewType formViewType = this.f93129n;
        int iHashCode13 = (((((iHashCode12 + (formViewType != null ? formViewType.hashCode() : 0)) * f93114B) + Boolean.valueOf(this.f93130o).hashCode()) * f93114B) + Boolean.valueOf(this.f93134s).hashCode()) * f93114B;
        r7 r7Var = this.f93133r;
        int iHashCode14 = (iHashCode13 + (r7Var != null ? r7Var.hashCode() : 0)) * f93114B;
        String str9 = this.f93140y;
        int iHashCode15 = (((((iHashCode14 + (str9 != null ? str9.hashCode() : 0)) * f93114B) + Boolean.valueOf(this.f93141z).hashCode()) * f93114B) + Boolean.valueOf(this.f93132q).hashCode()) * f93114B;
        String str10 = this.f93137v;
        int iHashCode16 = (iHashCode15 + (str10 != null ? str10.hashCode() : 0)) * f93114B;
        String str11 = this.f93138w;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public r7 i() {
        return this.f93133r;
    }

    public boolean isDarkModeEnabled() {
        return this.f93141z;
    }

    protected boolean isPoweredByVisible() {
        return this.f93134s;
    }

    public boolean isRtl() {
        return this.f93132q;
    }

    protected c8 j() {
        c8 c8Var = this.f93127l;
        return c8Var == null ? c8.Fade : c8Var;
    }

    public boolean k() {
        return this.f93135t;
    }

    protected boolean l() {
        return this.f93130o;
    }

    protected boolean n() {
        return this.f93139x;
    }

    protected j2(String str, String str2, String str3, String str4, String str5, List<ResourceContract> list, String str6, String str7, String str8, FormTriggerType formTriggerType, a aVar, c8 c8Var, InviteData inviteData, FormViewType formViewType, boolean z10, String str9, boolean z11, boolean z12, r7 r7Var, boolean z13, ArrayList<String> arrayList, String str10, String str11, boolean z14, String str12, boolean z15) {
        this.f93136u = new ArrayList<>();
        this.f93116a = str;
        this.f93117b = str2;
        this.f93118c = str3;
        this.f93119d = str4;
        this.f93120e = str5;
        this.f93122g = str6;
        this.f93123h = str7;
        this.f93124i = str8;
        this.f93125j = formTriggerType;
        this.f93126k = aVar;
        this.f93127l = c8Var;
        this.f93128m = inviteData;
        this.f93129n = formViewType == null ? FormViewType.none : formViewType;
        this.f93130o = z10;
        this.f93131p = str9;
        this.f93132q = z11;
        this.f93133r = r7Var;
        this.f93134s = z12;
        this.f93136u = arrayList;
        this.f93135t = z13;
        this.f93137v = str10;
        this.f93138w = str11;
        this.f93139x = z14;
        this.f93140y = str12;
        this.f93141z = z15;
        a(list);
        m();
    }

    public void a(InviteData inviteData) {
        this.f93128m = inviteData;
    }

    public void b(String str) {
        this.f93131p = str;
    }

    public void c(String str) {
        this.f93119d = str;
    }

    protected void d(String str) {
        this.f93120e = str;
    }

    public void e(String str) {
        this.f93122g = str;
    }

    public void a(MDAppearanceMode mDAppearanceMode) {
        this.f93115A = mDAppearanceMode;
    }

    public void b(boolean z10) {
        this.f93134s = z10;
    }

    public void c(boolean z10) {
        this.f93132q = z10;
    }

    protected void d(boolean z10) {
        this.f93139x = z10;
    }

    protected void a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return;
        }
        this.f93122g = sDKConfigurationFormContract.getTitle();
        this.f93124i = sDKConfigurationFormContract.getTitleBackgroundColor();
        this.f93123h = sDKConfigurationFormContract.getTitleTextColor();
        this.f93118c = sDKConfigurationFormContract.getFormJson().toString();
        this.f93125j = sDKConfigurationFormContract.getFormType();
        this.f93129n = sDKConfigurationFormContract.getFormViewType() != null ? sDKConfigurationFormContract.getFormViewType() : FormViewType.none;
        this.f93127l = ModelFactory.getInstance().createTransitionType(this.f93118c);
        this.f93128m = sDKConfigurationFormContract.getInviteData();
        this.f93130o = sDKConfigurationFormContract.isPreloaded();
        this.f93131p = sDKConfigurationFormContract.getFormLanguage();
        this.f93132q = sDKConfigurationFormContract.isRtl();
        this.f93133r = ModelFactory.getInstance().createThankYouDataObject(this.f93118c);
        this.f93134s = sDKConfigurationFormContract.isPoweredByVisible();
        this.f93137v = sDKConfigurationFormContract.getTemplateDebugRemoteUrl();
        this.f93138w = sDKConfigurationFormContract.getUrlVersion();
        this.f93141z = sDKConfigurationFormContract.isDarkModeEnabled();
        this.f93140y = sDKConfigurationFormContract.getHeaderThemeName();
    }

    protected void a(a aVar) {
        this.f93126k = aVar;
        m();
    }

    public void a(r7 r7Var) {
        this.f93133r = r7Var;
    }

    public void a(String str) {
        this.f93118c = str;
    }

    public void a(ArrayList<String> arrayList) {
        this.f93136u = arrayList;
    }

    protected void a(List<ResourceContract> list) {
        this.f93121f = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ResourceContract resourceContract : list) {
            resourceContract.setFormId(this.f93116a);
            this.f93121f.add(resourceContract);
        }
    }

    public void a(boolean z10) {
        this.f93135t = z10;
    }
}
