package Ha;

import Ma.PredictRequestContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"LHa/a;", "LHa/e;", "LMa/b;", "requestContext", "Ly9/b;", "requestManager", "Ln9/b;", "concurrentHandlerHolder", "LLa/a;", "requestModelBuilderProvider", "LHa/f;", "responseMapper", "LKa/a;", "lastTrackedContainer", "<init>", "(LMa/b;Ly9/b;Ln9/b;LLa/a;LHa/f;LKa/a;)V", "", "contactFieldId", "", "contactFieldValue", "", "b", "(ILjava/lang/String;)V", "a", "()V", "Ly9/b;", "Ln9/b;", "c", "LLa/a;", "d", "LHa/f;", "e", "LKa/a;", "Lv9/a;", "f", "Lv9/a;", "uuidProvider", "Lu9/a;", "g", "Lu9/a;", "timestampProvider", "LH9/h;", "h", "LH9/h;", "keyValueStore", "i", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final La.a requestModelBuilderProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f responseMapper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ka.a lastTrackedContainer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final H9.h keyValueStore;

    public a(PredictRequestContext requestContext, y9.b requestManager, n9.b concurrentHandlerHolder, La.a requestModelBuilderProvider, f responseMapper, Ka.a lastTrackedContainer) {
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(requestModelBuilderProvider, "requestModelBuilderProvider");
        Intrinsics.j(responseMapper, "responseMapper");
        Intrinsics.j(lastTrackedContainer, "lastTrackedContainer");
        this.requestManager = requestManager;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.requestModelBuilderProvider = requestModelBuilderProvider;
        this.responseMapper = responseMapper;
        this.lastTrackedContainer = lastTrackedContainer;
        this.uuidProvider = requestContext.getUuidProvider();
        this.timestampProvider = requestContext.getTimestampProvider();
        this.keyValueStore = requestContext.getKeyValueStore();
    }

    @Override // Ha.e
    public void a() {
        this.keyValueStore.remove("predict_contact_id");
        this.keyValueStore.remove("predict_contact_field_id");
        this.keyValueStore.remove("predict_visitor_id");
    }

    @Override // Ha.e
    public void b(int contactFieldId, String contactFieldValue) {
        Intrinsics.j(contactFieldValue, "contactFieldValue");
        this.keyValueStore.putString("predict_contact_id", contactFieldValue);
        this.keyValueStore.putInt("predict_contact_field_id", contactFieldId);
    }

    public /* synthetic */ a(PredictRequestContext predictRequestContext, y9.b bVar, n9.b bVar2, La.a aVar, f fVar, Ka.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(predictRequestContext, bVar, bVar2, aVar, fVar, (i10 & 32) != 0 ? new Ka.a() : aVar2);
    }
}
