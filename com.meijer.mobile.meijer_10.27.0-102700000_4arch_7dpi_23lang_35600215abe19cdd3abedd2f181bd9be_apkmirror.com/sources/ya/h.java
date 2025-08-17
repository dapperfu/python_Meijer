package ya;

import B9.ResponseModel;
import fa.InterfaceC13862c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C15128c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oa.C16008a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s9.C16914a;
import ta.C17075a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lya/h;", "LB9/a;", "Lta/a;", "actionCommandFactory", "Le9/c;", "Loa/a;", "Le9/d;", "repository", "Lfa/c;", "eventServiceInternal", "Ls9/a;", "timestampProvider", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(Lta/a;Le9/c;Lfa/c;Ls9/a;Ll9/b;)V", "LB9/c;", "responseModel", "", "c", "(LB9/c;)Z", "", "a", "(LB9/c;)V", "Lta/a;", "b", "Le9/c;", "Lfa/c;", "d", "Ls9/a;", "e", "Ll9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h extends B9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17075a actionCommandFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e9.c<C16008a, e9.d> repository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13862c eventServiceInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    public h(C17075a actionCommandFactory, e9.c<C16008a, e9.d> repository, InterfaceC13862c eventServiceInternal, C16914a timestampProvider, l9.b concurrentHandlerHolder) {
        Intrinsics.j(actionCommandFactory, "actionCommandFactory");
        Intrinsics.j(repository, "repository");
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.actionCommandFactory = actionCommandFactory;
        this.repository = repository;
        this.eventServiceInternal = eventServiceInternal;
        this.timestampProvider = timestampProvider;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    @Override // B9.a
    public void a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        try {
            JSONObject jSONObjectH = responseModel.h();
            Intrinsics.g(jSONObjectH);
            JSONObject jSONObject = jSONObjectH.getJSONObject("onEventAction");
            String string = jSONObject.getString("campaignId");
            G9.h hVar = G9.h.f11292a;
            JSONArray jSONArray = jSONObject.getJSONArray("actions");
            Intrinsics.i(jSONArray, "getJSONArray(...)");
            List<JSONObject> listH = hVar.h(jSONArray);
            ArrayList<Runnable> arrayList = new ArrayList(CollectionsKt.x(listH, 10));
            Iterator<T> it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(this.actionCommandFactory.a((JSONObject) it.next()));
            }
            for (Runnable runnable : arrayList) {
                if (runnable != null) {
                    runnable.run();
                }
            }
            C15128c c15128c = new C15128c(this.concurrentHandlerHolder, this.repository, this.timestampProvider);
            Intrinsics.g(string);
            c15128c.a(string, null, null);
            new ka.e(this.concurrentHandlerHolder, this.eventServiceInternal).a(string, null, null);
        } catch (JSONException e10) {
            I9.e.INSTANCE.c(new J9.b(e10, null, 2, null));
        }
    }

    @Override // B9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        try {
            JSONObject jSONObjectH = responseModel.h();
            JSONObject jSONObject = jSONObjectH != null ? jSONObjectH.getJSONObject("onEventAction") : null;
            if (jSONObject != null) {
                return jSONObject.has("actions");
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
