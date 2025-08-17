package z6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15329f;
import kw.w;
import y6.InterfaceC18172F;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lz6/m;", "Lz6/e;", "", "", "Ly6/F;", "uploads", "Lkw/h;", "operationByteString", "<init>", "(Ljava/util/Map;Lkw/h;)V", "c", "(Ljava/util/Map;)Lkw/h;", "Lkw/f;", "", "writeUploadContents", "", "e", "(Lkw/f;Z)V", "bufferedSink", "a", "(Lkw/f;)V", "Ljava/util/Map;", "b", "Lkw/h;", "Ljava/lang/String;", "boundary", "d", "getContentType", "()Ljava/lang/String;", "contentType", "", "Lkotlin/Lazy;", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class m implements InterfaceC18395e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InterfaceC18172F> uploads;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15331h operationByteString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentLength;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Map<String, ? extends InterfaceC18172F> uploads, C15331h operationByteString) {
        Intrinsics.j(uploads, "uploads");
        Intrinsics.j(operationByteString, "operationByteString");
        this.uploads = uploads;
        this.operationByteString = operationByteString;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        Intrinsics.i(string, "toString(...)");
        this.boundary = string;
        this.contentType = "multipart/form-data; boundary=" + string;
        this.contentLength = LazyKt.b(new Function0() { // from class: z6.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(m.d(this.f171639a));
            }
        });
    }

    private final C15331h c(Map<String, ? extends InterfaceC18172F> uploads) throws IOException {
        C15328e c15328e = new C15328e();
        C6.c cVar = new C6.c(c15328e, null);
        Set<Map.Entry<String, ? extends InterfaceC18172F>> setEntrySet = uploads.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        int i10 = 0;
        for (Object obj : setEntrySet) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            arrayList.add(TuplesKt.a(String.valueOf(i10), CollectionsKt.e(((Map.Entry) obj).getKey())));
            i10 = i11;
        }
        C6.b.a(cVar, MapsKt.y(arrayList));
        return c15328e.Q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(m mVar) throws IOException {
        C18391a c18391a = new C18391a(w.b());
        InterfaceC15329f interfaceC15329fC = w.c(c18391a);
        mVar.e(interfaceC15329fC, false);
        interfaceC15329fC.flush();
        long bytesWritten = c18391a.getBytesWritten();
        Iterator<T> it = mVar.uploads.values().iterator();
        long contentLength = 0;
        while (it.hasNext()) {
            contentLength += ((InterfaceC18172F) it.next()).getContentLength();
        }
        return bytesWritten + contentLength;
    }

    private final void e(InterfaceC15329f interfaceC15329f, boolean z10) throws IOException {
        interfaceC15329f.I0("--" + this.boundary + "\r\n");
        interfaceC15329f.I0("Content-Disposition: form-data; name=\"operations\"\r\n");
        interfaceC15329f.I0("Content-Type: application/json\r\n");
        interfaceC15329f.I0("Content-Length: " + this.operationByteString.V() + "\r\n");
        interfaceC15329f.I0("\r\n");
        interfaceC15329f.Z2(this.operationByteString);
        C15331h c15331hC = c(this.uploads);
        interfaceC15329f.I0("\r\n--" + this.boundary + "\r\n");
        interfaceC15329f.I0("Content-Disposition: form-data; name=\"map\"\r\n");
        interfaceC15329f.I0("Content-Type: application/json\r\n");
        interfaceC15329f.I0("Content-Length: " + c15331hC.V() + "\r\n");
        interfaceC15329f.I0("\r\n");
        interfaceC15329f.Z2(c15331hC);
        int i10 = 0;
        for (Object obj : this.uploads.values()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            InterfaceC18172F interfaceC18172F = (InterfaceC18172F) obj;
            interfaceC15329f.I0("\r\n--" + this.boundary + "\r\n");
            interfaceC15329f.I0("Content-Disposition: form-data; name=\"" + i10 + '\"');
            if (interfaceC18172F.getFileName() != null) {
                interfaceC15329f.I0("; filename=\"" + interfaceC18172F.getFileName() + '\"');
            }
            interfaceC15329f.I0("\r\n");
            interfaceC15329f.I0("Content-Type: " + interfaceC18172F.getContentType() + "\r\n");
            long contentLength = interfaceC18172F.getContentLength();
            if (contentLength != -1) {
                interfaceC15329f.I0("Content-Length: " + contentLength + "\r\n");
            }
            interfaceC15329f.I0("\r\n");
            if (z10) {
                interfaceC18172F.a(interfaceC15329f);
            }
            i10 = i11;
        }
        interfaceC15329f.I0("\r\n--" + this.boundary + "--\r\n");
    }

    @Override // z6.InterfaceC18395e
    public void a(InterfaceC15329f bufferedSink) throws IOException {
        Intrinsics.j(bufferedSink, "bufferedSink");
        e(bufferedSink, true);
    }

    @Override // z6.InterfaceC18395e
    public long getContentLength() {
        return ((Number) this.contentLength.getValue()).longValue();
    }

    @Override // z6.InterfaceC18395e
    public String getContentType() {
        return this.contentType;
    }
}
