package Ss;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LSs/t;", "LSs/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "value", "", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "d", "()Landroid/content/SharedPreferences;", "sharedPreferences", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t implements b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPreferences;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LSs/t$a;", "", "<init>", "()V", "LSs/t;", "a", "()LSs/t;", "", "FILE_NAME", "Ljava/lang/String;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ss.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final t a() {
            return new t(a.f35759a.a(), null);
        }
    }

    public /* synthetic */ t(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private t(final Context context) {
        this.sharedPreferences = LazyKt.b(new Function0() { // from class: Ss.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.e(context);
            }
        });
    }

    private final SharedPreferences d() {
        Object value = this.sharedPreferences.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences e(Context context) {
        return context.getSharedPreferences("com.okta.authfoundation.cache", 0);
    }

    @Override // Ss.b
    public String a(String key) {
        Intrinsics.j(key, "key");
        return d().getString(key, null);
    }

    @Override // Ss.b
    @SuppressLint({"ApplySharedPref"})
    public void b(String key, String value) {
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        d().edit().putString(key, value).commit();
    }
}
