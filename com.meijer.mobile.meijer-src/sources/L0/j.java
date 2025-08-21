package L0;

import Z.W;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "LL0/h;", "a", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)LL0/h;", "", "d", "(Ljava/lang/CharSequence;)Z", "K", "V", "LZ/W;", "f", "(Ljava/util/Map;)LZ/W;", "Landroidx/compose/runtime/F0;", "Landroidx/compose/runtime/F0;", "e", "()Landroidx/compose/runtime/F0;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<h> f17764a = r.f(a.f17765f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LL0/h;", "c", "()LL0/h;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<h> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f17765f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return null;
        }
    }

    public static final h a(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        return new i(map, function1);
    }

    public static final F0<h> e() {
        return f17764a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> W<K, V> f(Map<K, ? extends V> map) {
        W<K, V> w10 = new W<>(map.size());
        w10.t(map);
        return w10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
