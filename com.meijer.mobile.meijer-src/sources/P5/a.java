package P5;

import R5.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LP5/a;", "LP5/e;", "LP5/g;", "definition", "<init>", "(LP5/g;)V", "LQ5/e;", "a", "()LQ5/e;", "b", "LP5/g;", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f25595d = CollectionsKt.p("or", "and");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONDefinition definition;

    public a(JSONDefinition definition) {
        Intrinsics.j(definition, "definition");
        this.definition = definition;
    }

    @Override // P5.e
    public /* synthetic */ Q5.e a() {
        if (this.definition.getLogic() == null || this.definition.a() == null || this.definition.a().isEmpty()) {
            return null;
        }
        String strE = this.definition.getLogic();
        Locale ROOT = Locale.ROOT;
        Intrinsics.i(ROOT, "ROOT");
        String lowerCase = strE.toLowerCase(ROOT);
        Intrinsics.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!f25595d.contains(lowerCase)) {
            t.b("LaunchRulesEngine", "GroupCondition", "Unsupported logical operator: " + lowerCase, new Object[0]);
            return null;
        }
        List<e> listA = this.definition.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).a());
        }
        return new Q5.h(arrayList, lowerCase);
    }
}
