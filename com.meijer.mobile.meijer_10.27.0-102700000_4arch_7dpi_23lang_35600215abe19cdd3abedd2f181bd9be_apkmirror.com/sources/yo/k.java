package yo;

import Cs.MeijerAccount;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.N;
import com.adobe.marketing.mobile.r;
import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import io.reactivex.l;
import j$.time.LocalDateTime;
import j$.time.Year;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 \u0094\u00012\u00020\u0001:\u0001UB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\nJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\nJ\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010$\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0015J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0011J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0015\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u00020\b2\b\b\u0002\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\f¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J\u001d\u0010B\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u0010;\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\f2\u0006\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\u00020\b2\u0006\u0010;\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u0006¢\u0006\u0004\bK\u0010@J\u001d\u0010N\u001a\u00020\b2\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u000207¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u0002072\u0006\u0010L\u001a\u00020\f¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\b¢\u0006\u0004\bR\u0010\u0011J\r\u0010S\u001a\u00020\b¢\u0006\u0004\bS\u0010\u0011J\r\u0010T\u001a\u00020\u0006¢\u0006\u0004\bT\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020`0d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010kR\u0016\u0010o\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR$\u0010t\u001a\u00020`2\u0006\u0010\u0007\u001a\u00020`8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020`0u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR$\u0010z\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8V@WX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010n\"\u0004\by\u0010\u001eR\u0019\u0010}\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0011\u0010\u007f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b~\u0010\u0019R(\u0010\u0080\u0001\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010n\"\u0005\b\u0082\u0001\u0010\u001eR(\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010n\"\u0005\b\u0085\u0001\u0010\u001eR(\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010n\"\u0005\b\u0088\u0001\u0010\u001eR\u0015\u0010\u0089\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0019R'\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010\u0019\"\u0005\b\u008b\u0001\u0010\nR'\u0010\u008f\u0001\u001a\u0002072\u0006\u0010\u0007\u001a\u0002078V@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\\\u0010\u008d\u0001\"\u0005\b\u008e\u0001\u0010:R*\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\ba\u0010n\"\u0005\b\u0090\u0001\u0010\u001eR\u0013\u0010\u0093\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010nR'\u0010\u0096\u0001\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8V@WX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010n\"\u0005\b\u0095\u0001\u0010\u001eR\u0015\u0010\u0097\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010nR\u0013\u0010\u0099\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010nR\u0013\u0010\u009b\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010nR\u0016\u0010\u009d\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010nR\u0019\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010|R(\u0010¢\u0001\u001a\u0002072\u0006\u0010\u0007\u001a\u0002078F@GX\u0086\u000e¢\u0006\u000f\u001a\u0006\b \u0001\u0010\u008d\u0001\"\u0005\b¡\u0001\u0010:¨\u0006£\u0001"}, d2 = {"Lyo/k;", "LCs/b;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "value", "", "c0", "(Z)V", "", "", "storeFenceIds", "S", "(Ljava/util/List;)V", "j", "()V", "j$/time/LocalDateTime", "startOfYear", "w", "(Lj$/time/LocalDateTime;)Lj$/time/LocalDateTime;", "requestPermission", "N", "G", "()Z", "enrolled", "R", "date", "L", "(Ljava/lang/String;)V", "i0", "isDisclaimerVisible", "l", "H", "now", "t", "k", "LCs/d;", "tokenDetails", "g0", "(LCs/d;)V", "f", "LCs/a;", "account", "e0", "(LCs/a;)V", "LCs/c;", "userSettings", "f0", "(LCs/c;)V", "terms", "shouldClear", "M", "(Ljava/util/List;Z)V", "", "currentTimeMillis", "a0", "(J)V", "couponPage", "z", "(Ljava/lang/String;)Z", "showClippedSetting", "W", "(Ljava/lang/String;Z)V", "defaultSortBy", "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "couponSortBy", "Q", "(Ljava/lang/String;Ljava/lang/String;)V", "defaultCompareBy", "A", "(Ljava/lang/String;Ljava/lang/String;)Z", "showCouponCategories", "X", "key", "registrationId", "V", "(Ljava/lang/String;J)V", "s", "(Ljava/lang/String;)J", "d0", "O", "K", "a", "Landroid/content/SharedPreferences;", "Ljava/lang/reflect/ParameterizedType;", "b", "Ljava/lang/reflect/ParameterizedType;", "stringListType", "Lcom/squareup/moshi/h;", "c", "Lcom/squareup/moshi/h;", "moshiStringListAdapter", "Ltv/B;", "Lyo/c;", "d", "Ltv/B;", "userStateFlow", "Ltv/P;", "e", "Ltv/P;", "E", "()Ltv/P;", "userFlow", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "userChangeListener", "n", "()Ljava/lang/String;", "dateEnrolledInDigitalReceipts", "D", "()Lyo/c;", "setUser", "(Lyo/c;)V", "user", "Lio/reactivex/l;", "F", "()Lio/reactivex/l;", "userStream", "setUserPhone", "userPhone", "o", "()Ljava/util/List;", "fencedStores", "I", "isEmailVerified", "tempEmailAddress", "getTempEmailAddress", "Y", "tempPhoneNumber", "B", "Z", "prefsSubstitution", "r", "U", "isLoggedIn", "J", "T", "isOktaAuthenticated", "()J", "setDigitalId", "digitalId", "P", "cmpId", "y", "shopperId", "g", "setUserPin", "userPin", "externalShopperId", "p", "firstName", "q", "lastName", "h", "email", "v", "recentSearches", "C", "setUpdateNotificationTime", "updateNotificationTime", "persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class k implements Cs.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ParameterizedType stringListType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.h<List<String>> moshiStringListAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<MeijerUser> userStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<MeijerUser> userFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.OnSharedPreferenceChangeListener userChangeListener;

    public static /* synthetic */ LocalDateTime x(k kVar, LocalDateTime localDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDateTime = Year.now().atDay(1).atStartOfDay();
        }
        return kVar.w(localDateTime);
    }

    @Override // Cs.b
    public void f() {
        P(null);
    }

    public k(SharedPreferences sharedPreferences) {
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        ParameterizedType parameterizedTypeJ = x.j(List.class, String.class);
        Intrinsics.i(parameterizedTypeJ, "newParameterizedType(...)");
        this.stringListType = parameterizedTypeJ;
        com.squareup.moshi.h<List<String>> hVarD = new t.a().d().d(parameterizedTypeJ);
        Intrinsics.i(hVarD, "adapter(...)");
        this.moshiStringListAdapter = hVarD;
        InterfaceC17140B<MeijerUser> interfaceC17140BA = S.a(D());
        this.userStateFlow = interfaceC17140BA;
        this.userFlow = C17154h.c(interfaceC17140BA);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: yo.j
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                k.h0(this.f170825a, sharedPreferences2, str);
            }
        };
        this.userChangeListener = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static /* synthetic */ void b0(k kVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        kVar.a0(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(k kVar, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1197001518:
                    if (!str.equals("sso_digital_id")) {
                        return;
                    }
                    break;
                case -714755296:
                    if (!str.equals("user_last_name")) {
                        return;
                    }
                    break;
                case -695307149:
                    if (!str.equals("user_external_shopper_id")) {
                        return;
                    }
                    break;
                case 503291999:
                    if (!str.equals("PREFS_IS_OKTA_AUTHENTICATED")) {
                        return;
                    }
                    break;
                case 1174158254:
                    if (!str.equals("user_first_name")) {
                        return;
                    }
                    break;
                case 1921668648:
                    if (!str.equals("user_email")) {
                        return;
                    }
                    break;
                case 1931692026:
                    if (!str.equals("user_phone")) {
                        return;
                    }
                    break;
                case 1953580032:
                    if (!str.equals("PREFS_MPERKS_VERSION")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        InterfaceC17140B<MeijerUser> interfaceC17140B = kVar.userStateFlow;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), kVar.D())) {
        }
    }

    private final String n() {
        return this.sharedPreferences.getString("user_date_enrolled_in_digital_receipts", "");
    }

    public static /* synthetic */ LocalDateTime u(k kVar, LocalDateTime localDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDateTime = LocalDateTime.now();
        }
        return kVar.t(localDateTime);
    }

    public final boolean A(String couponPage, String defaultCompareBy) {
        Intrinsics.j(couponPage, "couponPage");
        Intrinsics.j(defaultCompareBy, "defaultCompareBy");
        return this.sharedPreferences.getBoolean("pref_coupons_show_categories_" + couponPage, Intrinsics.e(couponPage, defaultCompareBy));
    }

    public final String B() {
        String string = this.sharedPreferences.getString("temporary_phone_number", "");
        return string == null ? "" : string;
    }

    public final long C() {
        return this.sharedPreferences.getLong("last_app_update_notification", 0L);
    }

    public final MeijerUser D() {
        return new MeijerUser(a(), h(), p(), q(), e(), b(), null, J(), false, 64, null);
    }

    public final P<MeijerUser> E() {
        return this.userFlow;
    }

    public final l<MeijerUser> F() {
        l<MeijerUser> lVarDistinctUntilChanged = xv.h.d(this.userFlow, null, 1, null).distinctUntilChanged();
        Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return lVarDistinctUntilChanged;
    }

    public final boolean G() {
        return this.sharedPreferences.getBoolean("user_optin_notifications", false);
    }

    public final boolean H() {
        return this.sharedPreferences.getBoolean("is_disclaimer_visible", true);
    }

    public final boolean I() {
        return this.sharedPreferences.getBoolean("user_email_verified", false);
    }

    public final boolean J() {
        return this.sharedPreferences.getBoolean("PREFS_IS_OKTA_AUTHENTICATED", false);
    }

    public final boolean K() {
        return this.userStateFlow.getValue().getRequiresLogin();
    }

    public final void L(String date) {
        Intrinsics.j(date, "date");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("mperks4_points_expiry_bottom_sheet_seen_on", date);
        editorEdit.apply();
    }

    public final void M(List<String> terms, boolean shouldClear) {
        Intrinsics.j(terms, "terms");
        if (shouldClear) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.putString("recentSearchTermsMadeByUser", "");
            editorEdit.apply();
        } else {
            SharedPreferences.Editor editorEdit2 = this.sharedPreferences.edit();
            editorEdit2.putString("recentSearchTermsMadeByUser", CollectionsKt.B0(terms, ",", null, null, 0, null, null, 62, null));
            editorEdit2.apply();
        }
    }

    public final void N(boolean requestPermission) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("requesting_location_for_geofence", requestPermission);
        editorEdit.apply();
    }

    public final void O() {
        MeijerUser value;
        InterfaceC17140B<MeijerUser> interfaceC17140B = this.userStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, MeijerUser.b(value, null, null, null, null, null, false, null, false, true, l3.f92484c, null)));
    }

    public void P(String str) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("cmpid", str);
        editorEdit.apply();
    }

    public final void Q(String couponPage, String couponSortBy) {
        Intrinsics.j(couponPage, "couponPage");
        if (couponSortBy != null) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.putString("pref_coupons_sort_by_" + couponPage, couponSortBy);
            editorEdit.apply();
            return;
        }
        SharedPreferences.Editor editorEdit2 = this.sharedPreferences.edit();
        editorEdit2.remove("pref_coupons_sort_by_" + couponPage);
        editorEdit2.apply();
    }

    public final void R(boolean enrolled) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("user_optin_notifications", enrolled);
        editorEdit.apply();
    }

    public final void S(List<String> storeFenceIds) {
        Intrinsics.j(storeFenceIds, "storeFenceIds");
        String json = this.moshiStringListAdapter.toJson(storeFenceIds);
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("currently_fenced_stores", json);
        editorEdit.apply();
    }

    public final void T(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("PREFS_IS_OKTA_AUTHENTICATED", z10);
        editorEdit.apply();
    }

    public final void U(String prefsSubstitution) {
        Intrinsics.j(prefsSubstitution, "prefsSubstitution");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("grocery_substitution", prefsSubstitution);
        editorEdit.apply();
    }

    public final void V(String key, long registrationId) {
        Intrinsics.j(key, "key");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong(key, registrationId);
        editorEdit.apply();
    }

    public final void W(String couponPage, boolean showClippedSetting) {
        Intrinsics.j(couponPage, "couponPage");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("pref_coupons_show_clipped_" + couponPage, showClippedSetting);
        editorEdit.apply();
    }

    public final void X(String couponPage, boolean showCouponCategories) {
        Intrinsics.j(couponPage, "couponPage");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("pref_coupons_show_categories_" + couponPage, showCouponCategories);
        editorEdit.apply();
    }

    public final void Y(String tempEmailAddress) {
        Intrinsics.j(tempEmailAddress, "tempEmailAddress");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("temporary_email_address", tempEmailAddress);
        editorEdit.apply();
    }

    public final void Z(String tempPhoneNumber) {
        Intrinsics.j(tempPhoneNumber, "tempPhoneNumber");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("temporary_phone_number", tempPhoneNumber);
        editorEdit.apply();
    }

    @Override // Cs.b
    public String a() {
        String string = this.sharedPreferences.getString("user_external_shopper_id", "");
        return string == null ? "" : string;
    }

    @JvmOverloads
    public final void a0(long currentTimeMillis) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putLong("last_app_update_notification", currentTimeMillis);
        editorEdit.apply();
    }

    @Override // Cs.b
    public long c() {
        return this.sharedPreferences.getLong("sso_digital_id", 0L);
    }

    public final void c0(boolean value) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("settingsUserIsAuthenticated", value);
        editorEdit.apply();
    }

    @Override // Cs.b
    public String d() {
        return this.sharedPreferences.getString("cmpid", null);
    }

    @Override // Cs.b
    public String e() {
        String string = this.sharedPreferences.getString("user_phone", "");
        return string == null ? "" : string;
    }

    public final void e0(MeijerAccount account) {
        Intrinsics.j(account, "account");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("user_first_name", account.getFirstName());
        editorEdit.putString("user_last_name", account.getLastName());
        editorEdit.putString("user_phone", String.valueOf(account.getMPerksPhone()));
        editorEdit.putString("user_pin", account.getMPerksPin());
        editorEdit.putString("user_zip", account.getZip());
        editorEdit.putString("user_email", account.getEmail());
        editorEdit.apply();
    }

    public final void f0(Cs.c userSettings) {
        Intrinsics.j(userSettings, "userSettings");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("user_optin_notifications", userSettings.getEnrolledForMobileNotifications());
        editorEdit.putBoolean("user_enrolled_in_email_receipts", userSettings.getEnrolledForEmailReceipts());
        editorEdit.putString("user_date_enrolled_in_digital_receipts", userSettings.b());
        editorEdit.apply();
    }

    @Override // Cs.b
    public String g() {
        String string = this.sharedPreferences.getString("user_pin", "");
        return string == null ? "" : string;
    }

    public final void g0(Cs.d tokenDetails) {
        Long lX;
        Intrinsics.j(tokenDetails, "tokenDetails");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        String digitalId = tokenDetails.getDigitalId();
        editorEdit.putLong("sso_digital_id", (digitalId == null || (lX = StringsKt.x(digitalId)) == null) ? 0L : lX.longValue());
        editorEdit.putString("user_external_shopper_id", tokenDetails.getExternalShopperId());
        editorEdit.putString("user_shopperid", tokenDetails.getShopperId());
        editorEdit.apply();
    }

    @Override // Cs.b
    public String h() {
        String string = this.sharedPreferences.getString("user_email", "");
        return string == null ? "" : string;
    }

    public final boolean i0() {
        String string = this.sharedPreferences.getString("mperks4_points_expiry_bottom_sheet_seen_on", "");
        if (string != null && string.length() != 0) {
            String string2 = this.sharedPreferences.getString("mperks4_points_expiry_bottom_sheet_seen_on", "");
            LocalDateTime localDateTime = string2 != null ? (LocalDateTime) vk.d.b(string2, C17590a.f164803a.s(), new th.j()) : null;
            Intrinsics.h(localDateTime, "null cannot be cast to non-null type java.time.LocalDateTime");
            if (LocalDateTime.now().isAfter(localDateTime) && LocalDateTime.now().getMonth() == localDateTime.getMonth()) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.remove("currently_fenced_stores");
        editorEdit.apply();
    }

    public final void k() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final void l(boolean isDisclaimerVisible) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("is_disclaimer_visible", isDisclaimerVisible);
        editorEdit.apply();
    }

    public final String m(String couponPage, String defaultSortBy) {
        Intrinsics.j(couponPage, "couponPage");
        Intrinsics.j(defaultSortBy, "defaultSortBy");
        String string = this.sharedPreferences.getString("pref_coupons_sort_by_" + couponPage, defaultSortBy);
        return string == null ? defaultSortBy : string;
    }

    public final List<String> o() {
        String string = this.sharedPreferences.getString("currently_fenced_stores", "[]");
        return this.moshiStringListAdapter.fromJson(string != null ? string : "[]");
    }

    public final String p() {
        String string = this.sharedPreferences.getString("user_first_name", "");
        return string == null ? "" : string;
    }

    public final String q() {
        String string = this.sharedPreferences.getString("user_last_name", "");
        return string == null ? "" : string;
    }

    public final String r() {
        String string = this.sharedPreferences.getString("grocery_substitution", "");
        return string == null ? "" : string;
    }

    public final long s(String key) {
        Intrinsics.j(key, "key");
        return this.sharedPreferences.getLong(key, 0L);
    }

    public final LocalDateTime t(LocalDateTime now) {
        Intrinsics.j(now, "now");
        String strN = n();
        LocalDateTime localDateTime = null;
        if (strN != null) {
            if (StringsKt.r0(strN)) {
                strN = null;
            }
            if (strN != null) {
                C17590a c17590a = C17590a.f164803a;
                localDateTime = (LocalDateTime) vk.d.c(strN, CollectionsKt.p(c17590a.A(), c17590a.z(), C17590a.SQL_LOCAL_DATE_TIME_LOW_PRECISION), new th.j());
            }
        }
        LocalDateTime localDateTimeMinusYears = now.minusYears(2L);
        if (localDateTime != null) {
            Intrinsics.g(localDateTimeMinusYears);
            LocalDateTime localDateTime2 = (LocalDateTime) RangesKt.h(localDateTime, localDateTimeMinusYears);
            if (localDateTime2 != null) {
                return localDateTime2;
            }
        }
        Intrinsics.g(localDateTimeMinusYears);
        return localDateTimeMinusYears;
    }

    public final List<String> v() {
        String string = this.sharedPreferences.getString("recentSearchTermsMadeByUser", "");
        String str = (string == null || StringsKt.r0(string)) ? null : string;
        List<String> listA1 = str != null ? StringsKt.a1(str, new String[]{","}, false, 0, 6, null) : null;
        return listA1 == null ? CollectionsKt.m() : listA1;
    }

    public final LocalDateTime w(LocalDateTime startOfYear) {
        LocalDateTime localDateTime;
        Intrinsics.j(startOfYear, "startOfYear");
        LocalDateTime localDateTime2 = null;
        String string = this.sharedPreferences.getString("user_savings_since", null);
        if (string != null) {
            if (StringsKt.r0(string)) {
                string = null;
            }
            if (string != null) {
                localDateTime2 = (LocalDateTime) vk.d.b(string, C17590a.ISO_LOCAL_DATE_TIME, new th.j());
            }
        }
        return (localDateTime2 == null || (localDateTime = (LocalDateTime) RangesKt.h(localDateTime2, startOfYear)) == null) ? startOfYear : localDateTime;
    }

    public final String y() {
        String string = this.sharedPreferences.getString("user_shopperid", "");
        return string == null ? "" : string;
    }

    public final boolean z(String couponPage) {
        Intrinsics.j(couponPage, "couponPage");
        return this.sharedPreferences.getBoolean("pref_coupons_show_clipped_" + couponPage, false);
    }

    @Override // Cs.b
    public boolean b() {
        return !StringsKt.r0(a());
    }

    public final void d0() {
        String strValueOf = String.valueOf(c());
        r.e(MapsKt.o(TuplesKt.a("digitalaccountid", strValueOf), TuplesKt.a("AdobeCampaignID", strValueOf), TuplesKt.a("crm_digital_id", strValueOf), TuplesKt.a("AdobeTargetID", strValueOf)), N.a.AUTHENTICATED);
    }
}
