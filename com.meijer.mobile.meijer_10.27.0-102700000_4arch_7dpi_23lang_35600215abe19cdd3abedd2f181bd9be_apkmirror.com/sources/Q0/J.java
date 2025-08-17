package Q0;

import io.constructor.data.local.PreferencesHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Deprecated
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"LQ0/J;", "", "<init>", "()V", "", PreferencesHelper.PREF_ID, "", "value", "", "b", "(ILjava/lang/String;)Lkotlin/Unit;", "", "LQ0/I;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, I> children = new LinkedHashMap();

    public final Map<Integer, I> a() {
        return this.children;
    }

    public final Unit b(int id2, String value) {
        Function1<String, Unit> function1C;
        I i10 = this.children.get(Integer.valueOf(id2));
        if (i10 == null || (function1C = i10.c()) == null) {
            return null;
        }
        function1C.invoke(value);
        return Unit.f142422a;
    }
}
