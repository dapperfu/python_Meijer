package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C14672p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010$¨\u0006."}, d2 = {"Li4/q;", "Li4/p;", "D", "", "Li4/B;", "navigator", "", PreferencesHelper.PREF_ID, "", PlaceTypes.ROUTE, "<init>", "(Li4/B;ILjava/lang/String;)V", "(Li4/B;Ljava/lang/String;)V", "a", "()Li4/p;", "Li4/B;", "getNavigator", "()Li4/B;", "b", "I", "getId", "()I", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "Li4/f;", "e", "Ljava/util/Map;", "arguments", "", "Li4/m;", "f", "Ljava/util/List;", "deepLinks", "Li4/e;", "g", "actions", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14673q<D extends C14672p> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14653B<? extends D> navigator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String route;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, C14662f> arguments;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<C14669m> deepLinks;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, C14661e> actions;

    public C14673q(AbstractC14653B<? extends D> navigator, int i10, String str) {
        Intrinsics.j(navigator, "navigator");
        this.navigator = navigator;
        this.id = i10;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    public D a() {
        D d10 = (D) this.navigator.a();
        d10.D(this.label);
        for (Map.Entry<String, C14662f> entry : this.arguments.entrySet()) {
            d10.f(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d10.h((C14669m) it.next());
        }
        for (Map.Entry<Integer, C14661e> entry2 : this.actions.entrySet()) {
            d10.B(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d10.F(str);
        }
        int i10 = this.id;
        if (i10 != -1) {
            d10.C(i10);
        }
        return d10;
    }

    /* renamed from: b, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14673q(AbstractC14653B<? extends D> navigator, String str) {
        this(navigator, -1, str);
        Intrinsics.j(navigator, "navigator");
    }
}
