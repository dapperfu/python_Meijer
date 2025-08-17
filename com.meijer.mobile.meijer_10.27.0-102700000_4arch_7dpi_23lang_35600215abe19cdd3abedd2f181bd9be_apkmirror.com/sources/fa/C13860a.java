package fa;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00110\u00108\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfa/a;", "LW9/a;", "<init>", "()V", "newEventHandler", "", "b", "(LW9/a;)V", "Landroid/content/Context;", "context", "", "eventName", "Lorg/json/JSONObject;", "payload", "a", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)V", "", "Lkotlin/Triple;", "Ljava/util/List;", "events", "LW9/a;", "eventHandler", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13860a implements W9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<Triple<Context, String, JSONObject>> events = new ArrayList();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private W9.a eventHandler;

    @Override // W9.a
    public void a(Context context, String eventName, JSONObject payload) {
        Intrinsics.j(context, "context");
        Intrinsics.j(eventName, "eventName");
        if (C15125a.c(N8.a.f21474e) && this.eventHandler == null) {
            this.events.add(new Triple<>(context, eventName, payload));
            return;
        }
        W9.a aVar = this.eventHandler;
        if (aVar != null) {
            aVar.a(context, eventName, payload);
        }
    }

    public void b(W9.a newEventHandler) {
        if (newEventHandler != null) {
            Iterator<T> it = this.events.iterator();
            while (it.hasNext()) {
                Triple triple = (Triple) it.next();
                newEventHandler.a((Context) triple.d(), (String) triple.e(), (JSONObject) triple.f());
            }
            this.events.clear();
        }
        this.eventHandler = newEventHandler;
    }
}
