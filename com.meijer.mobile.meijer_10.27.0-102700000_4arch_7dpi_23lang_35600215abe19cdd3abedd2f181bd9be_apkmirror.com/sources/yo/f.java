package yo;

import Tq.SimpleStoreSummary;
import android.content.SharedPreferences;
import io.constructor.data.local.PreferencesHelper;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 32\u00020\u0001:\u0001\u001dB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\f\u001a\u00060\u0006j\u0002`\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010(\u001a\b\u0012\u0004\u0012\u00020 0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010-R\u0014\u00101\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u00100R\u0016\u00105\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00100R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020 088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010<R\u0014\u0010?\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010-R\u0016\u0010A\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010-¨\u0006B"}, d2 = {"Lyo/f;", "LTq/j;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "m", "(I)Z", PreferencesHelper.PREF_ID, "", "name", "state", "zip", "", "o", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "n", "(ILjava/lang/String;Ljava/lang/String;)V", "Lyo/d;", "type", "p", "(Lyo/d;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "context", "j", "(Lyo/d;)V", "a", "Landroid/content/SharedPreferences;", "Ltv/B;", "LTq/k;", "b", "Ltv/B;", "_store", "Ltv/P;", "c", "Ltv/P;", "()Ltv/P;", "storeFlow", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "d", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "storeChangeListener", "()LTq/k;", "currentStoreDetails", "g", "()I", "currentStoreId", "homeStoreId", "e", "()Ljava/lang/String;", "homeStoreName", "l", "cartStoreId", "Lio/reactivex/l;", "f", "()Lio/reactivex/l;", "storeStream", "()Z", "isStoreSet", "h", "homeStoreDetails", "k", "cartStoreDetails", "persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class f implements Tq.j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Tq.k> _store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<Tq.k> storeFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.OnSharedPreferenceChangeListener storeChangeListener;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f170813a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f170814b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(SharedPreferences sharedPreferences) {
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        InterfaceC17140B<Tq.k> interfaceC17140BA = S.a(a());
        this._store = interfaceC17140BA;
        this.storeFlow = C17154h.c(interfaceC17140BA);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: yo.e
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                f.r(this.f170817a, sharedPreferences2, str);
            }
        };
        this.storeChangeListener = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static /* synthetic */ void q(f fVar, d dVar, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        fVar.p(dVar, i10, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(f fVar, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2038084579:
                    if (!str.equals("user_store_name")) {
                        return;
                    }
                    break;
                case -1927083495:
                    if (!str.equals("PREFS_CART_STORE_NAME")) {
                        return;
                    }
                    break;
                case -628033092:
                    if (!str.equals("user_store_zipcode")) {
                        return;
                    }
                    break;
                case 1583013113:
                    if (!str.equals("PREFS_CART_STORE_ZIP_CODE")) {
                        return;
                    }
                    break;
                case 1767709485:
                    if (!str.equals("user_store_id")) {
                        return;
                    }
                    break;
                case 1866148905:
                    if (!str.equals("PREFS_CART_STORE_ID")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
        }
        InterfaceC17140B<Tq.k> interfaceC17140B = fVar._store;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), fVar.a())) {
        }
    }

    @Override // Tq.j
    public int b() {
        return this.sharedPreferences.getInt("user_store_id", 0);
    }

    @Override // Tq.j
    public P<Tq.k> c() {
        return this.storeFlow;
    }

    @Override // Tq.j
    public String e() {
        return this.sharedPreferences.getString("user_store_name", "");
    }

    @Override // Tq.j
    public l<Tq.k> f() {
        return xv.h.d(this._store, null, 1, null);
    }

    @Override // Tq.j
    public Tq.k h() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        return new SimpleStoreSummary(sharedPreferences.getInt("user_store_id", 0), sharedPreferences.getString("user_store_name", null), sharedPreferences.getString("user_store_zipcode", null), 0.0d, 8, null);
    }

    public final void j(d context) {
        Intrinsics.j(context, "context");
        int i10 = b.$EnumSwitchMapping$0[context.ordinal()];
        if (i10 == 1) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.remove("user_store_id");
            editorEdit.remove("user_store_name");
            editorEdit.remove("user_store_state");
            editorEdit.remove("user_store_zipcode");
            editorEdit.apply();
            return;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        SharedPreferences.Editor editorEdit2 = this.sharedPreferences.edit();
        editorEdit2.remove("PREFS_CART_STORE_ID");
        editorEdit2.remove("PREFS_CART_STORE_NAME");
        editorEdit2.remove("PREFS_CART_STORE_ZIP_CODE");
        editorEdit2.apply();
    }

    public Tq.k k() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Integer numValueOf = Integer.valueOf(sharedPreferences.getInt("PREFS_CART_STORE_ID", 0));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new SimpleStoreSummary(numValueOf.intValue(), sharedPreferences.getString("PREFS_CART_STORE_NAME", null), sharedPreferences.getString("PREFS_CART_STORE_ZIP_CODE", null), 0.0d, 8, null);
        }
        return null;
    }

    public int l() {
        return this.sharedPreferences.getInt("PREFS_CART_STORE_ID", 0);
    }

    public final void n(int id2, String name, String zip) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt("PREFS_CART_STORE_ID", id2);
        if (name != null) {
            editorEdit.putString("PREFS_CART_STORE_NAME", name);
        }
        editorEdit.putString("PREFS_CART_STORE_ZIP_CODE", zip);
        editorEdit.apply();
    }

    public final void o(int id2, String name, String state, String zip) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt("user_store_id", id2);
        if (name != null) {
            editorEdit.putString("user_store_name", name);
        }
        if (state != null) {
            editorEdit.putString("user_store_state", state);
        }
        editorEdit.putString("user_store_zipcode", zip);
        editorEdit.apply();
    }

    public final void p(d type, int id2, String name, String state, String zip) {
        Intrinsics.j(type, "type");
        int i10 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            o(id2, name, state, zip);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            n(id2, name, zip);
        }
    }

    @Override // Tq.j
    public Tq.k a() {
        Tq.k kVarK = k();
        if (kVarK == null) {
            return h();
        }
        return kVarK;
    }

    @Override // Tq.j
    public boolean d() {
        if (b() != 0) {
            return true;
        }
        return false;
    }

    @Override // Tq.j
    public int g() {
        return a().getStoreId();
    }

    public boolean m(int storeId) {
        if (b() != 0 && b() == storeId) {
            return true;
        }
        return false;
    }
}
