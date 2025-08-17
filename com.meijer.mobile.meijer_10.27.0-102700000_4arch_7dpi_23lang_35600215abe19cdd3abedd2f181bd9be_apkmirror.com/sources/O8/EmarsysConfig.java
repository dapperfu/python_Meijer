package O8;

import android.app.Application;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001e\u0010$R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b'\u0010$¨\u0006("}, d2 = {"LO8/h;", "", "Landroid/app/Application;", "application", "", "applicationCode", "merchantId", "", "LT8/a;", "experimentalFeatures", "", "automaticPushTokenSendingEnabled", "sharedPackageNames", "sharedSecret", "verboseConsoleLoggingEnabled", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/app/Application;", "()Landroid/app/Application;", "b", "Ljava/lang/String;", "c", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "Z", "()Z", "f", "g", "h", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: O8.h, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class EmarsysConfig {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Application application;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String applicationCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<T8.a> experimentalFeatures;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean automaticPushTokenSendingEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> sharedPackageNames;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sharedSecret;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean verboseConsoleLoggingEnabled;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u000bJ\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006%"}, d2 = {"LO8/h$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "a", "(Landroid/app/Application;)LO8/h$a;", "", "mobileEngageApplicationCode", "b", "(Ljava/lang/String;)LO8/h$a;", "predictMerchantId", "f", "d", "()LO8/h$a;", "sharedSecret", "h", "", "sharedPackageNames", "g", "(Ljava/util/List;)LO8/h$a;", "e", "LO8/h;", "c", "()LO8/h;", "Landroid/app/Application;", "Ljava/lang/String;", "applicationCode", "merchantId", "LT8/a;", "Ljava/util/List;", "experimentalFeatures", "", "Z", "automaticPushTokenSending", "verboseConsoleLoggingEnabled", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: O8.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Application application;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String applicationCode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String merchantId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private List<? extends T8.a> experimentalFeatures;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean automaticPushTokenSending = true;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String sharedSecret;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private List<String> sharedPackageNames;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean verboseConsoleLoggingEnabled;

        public final a d() {
            this.automaticPushTokenSending = false;
            return this;
        }

        public final a e() {
            this.verboseConsoleLoggingEnabled = true;
            return this;
        }

        public final a a(Application application) {
            Intrinsics.j(application, "application");
            this.application = application;
            return this;
        }

        public final a b(String mobileEngageApplicationCode) {
            this.applicationCode = mobileEngageApplicationCode;
            return this;
        }

        public final EmarsysConfig c() {
            List<? extends T8.a> listM = this.experimentalFeatures;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            this.experimentalFeatures = listM;
            Application application = this.application;
            if (application == null) {
                Intrinsics.y("application");
                application = null;
            }
            String str = this.applicationCode;
            String str2 = this.merchantId;
            List<? extends T8.a> list = this.experimentalFeatures;
            Intrinsics.g(list);
            return new EmarsysConfig(application, str, str2, list, this.automaticPushTokenSending, this.sharedPackageNames, this.sharedSecret, this.verboseConsoleLoggingEnabled);
        }

        public final a f(String predictMerchantId) {
            this.merchantId = predictMerchantId;
            return this;
        }

        public final a g(List<String> sharedPackageNames) {
            Intrinsics.j(sharedPackageNames, "sharedPackageNames");
            this.sharedPackageNames = sharedPackageNames;
            return this;
        }

        public final a h(String sharedSecret) {
            Intrinsics.j(sharedSecret, "sharedSecret");
            this.sharedSecret = sharedSecret;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmarsysConfig(Application application, String str, String str2, List<? extends T8.a> experimentalFeatures, boolean z10, List<String> list, String str3, boolean z11) {
        Intrinsics.j(application, "application");
        Intrinsics.j(experimentalFeatures, "experimentalFeatures");
        this.application = application;
        this.applicationCode = str;
        this.merchantId = str2;
        this.experimentalFeatures = experimentalFeatures;
        this.automaticPushTokenSendingEnabled = z10;
        this.sharedPackageNames = list;
        this.sharedSecret = str3;
        this.verboseConsoleLoggingEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmarsysConfig)) {
            return false;
        }
        EmarsysConfig emarsysConfig = (EmarsysConfig) other;
        return Intrinsics.e(this.application, emarsysConfig.application) && Intrinsics.e(this.applicationCode, emarsysConfig.applicationCode) && Intrinsics.e(this.merchantId, emarsysConfig.merchantId) && Intrinsics.e(this.experimentalFeatures, emarsysConfig.experimentalFeatures) && this.automaticPushTokenSendingEnabled == emarsysConfig.automaticPushTokenSendingEnabled && Intrinsics.e(this.sharedPackageNames, emarsysConfig.sharedPackageNames) && Intrinsics.e(this.sharedSecret, emarsysConfig.sharedSecret) && this.verboseConsoleLoggingEnabled == emarsysConfig.verboseConsoleLoggingEnabled;
    }

    /* renamed from: a, reason: from getter */
    public final Application getApplication() {
        return this.application;
    }

    /* renamed from: b, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAutomaticPushTokenSendingEnabled() {
        return this.automaticPushTokenSendingEnabled;
    }

    public final List<T8.a> d() {
        return this.experimentalFeatures;
    }

    /* renamed from: e, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final List<String> f() {
        return this.sharedPackageNames;
    }

    /* renamed from: g, reason: from getter */
    public final String getSharedSecret() {
        return this.sharedSecret;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getVerboseConsoleLoggingEnabled() {
        return this.verboseConsoleLoggingEnabled;
    }

    public int hashCode() {
        int iHashCode = this.application.hashCode() * 31;
        String str = this.applicationCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantId;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.experimentalFeatures.hashCode()) * 31) + Boolean.hashCode(this.automaticPushTokenSendingEnabled)) * 31;
        List<String> list = this.sharedPackageNames;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.sharedSecret;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.verboseConsoleLoggingEnabled);
    }

    public String toString() {
        return "EmarsysConfig(application=" + this.application + ", applicationCode=" + this.applicationCode + ", merchantId=" + this.merchantId + ", experimentalFeatures=" + this.experimentalFeatures + ", automaticPushTokenSendingEnabled=" + this.automaticPushTokenSendingEnabled + ", sharedPackageNames=" + this.sharedPackageNames + ", sharedSecret=" + this.sharedSecret + ", verboseConsoleLoggingEnabled=" + this.verboseConsoleLoggingEnabled + ")";
    }

    public /* synthetic */ EmarsysConfig(Application application, String str, String str2, List list, boolean z10, List list2, String str3, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? false : z11);
    }
}
