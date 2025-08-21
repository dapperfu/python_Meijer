package Aa;

import D9.ResponseModel;
import ha.InterfaceC14492c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ma.C15699c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qa.C16616a;
import u9.C17361a;
import va.C17650a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LAa/h;", "LD9/a;", "Lva/a;", "actionCommandFactory", "Lg9/c;", "Lqa/a;", "Lg9/d;", "repository", "Lha/c;", "eventServiceInternal", "Lu9/a;", "timestampProvider", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Lva/a;Lg9/c;Lha/c;Lu9/a;Ln9/b;)V", "LD9/c;", "responseModel", "", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "Lva/a;", "b", "Lg9/c;", "Lha/c;", "d", "Lu9/a;", "e", "Ln9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class h extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17650a actionCommandFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g9.c<C16616a, g9.d> repository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14492c eventServiceInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    public h(C17650a actionCommandFactory, g9.c<C16616a, g9.d> repository, InterfaceC14492c eventServiceInternal, C17361a timestampProvider, n9.b concurrentHandlerHolder) {
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

    @Override // D9.a
    public void a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        try {
            JSONObject jSONObjectH = responseModel.h();
            Intrinsics.g(jSONObjectH);
            JSONObject jSONObject = jSONObjectH.getJSONObject("onEventAction");
            String string = jSONObject.getString("campaignId");
            I9.h hVar = I9.h.f14391a;
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
            C15699c c15699c = new C15699c(this.concurrentHandlerHolder, this.repository, this.timestampProvider);
            Intrinsics.g(string);
            c15699c.a(string, null, null);
            new ma.e(this.concurrentHandlerHolder, this.eventServiceInternal).a(string, null, null);
        } catch (JSONException e10) {
            K9.e.INSTANCE.c(new L9.b(e10, null, 2, null));
        }
    }

    @Override // D9.a
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
