package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.assurance.internal.G;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class M extends I<C6430l> {

    /* renamed from: j, reason: collision with root package name */
    static final int f62174j = (int) Math.floor(24576.0d);

    /* renamed from: k, reason: collision with root package name */
    static final int f62175k = (int) Math.floor(11520.0d);

    /* renamed from: f, reason: collision with root package name */
    private final G f62176f;

    /* renamed from: g, reason: collision with root package name */
    private final C6422d f62177g;

    /* renamed from: h, reason: collision with root package name */
    private final a f62178h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f62179i;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f62180a;

        public List<C6430l> a(C6430l c6430l) throws IOException {
            if (c6430l == null) {
                return Collections.EMPTY_LIST;
            }
            if (c6430l.e() == null) {
                Q5.t.f("Assurance", "OutboundEventQueueWorker", "Cannot chunk event: %s with an empty payload!", c6430l.f62275a);
                return Collections.singletonList(c6430l);
            }
            String str = "UTF-8";
            byte[] bytes = new JSONObject(c6430l.e()).toString().getBytes(Charset.forName("UTF-8"));
            if (bytes.length < this.f62180a) {
                return Collections.singletonList(c6430l);
            }
            ArrayList arrayList = new ArrayList();
            double dCeil = Math.ceil(bytes.length / this.f62180a);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[this.f62180a];
            try {
                String string = UUID.randomUUID().toString();
                int i10 = 0;
                while (true) {
                    int i11 = byteArrayInputStream.read(bArr);
                    if (i11 == -1) {
                        return arrayList;
                    }
                    HashMap map = new HashMap();
                    String str2 = str;
                    map.put("chunkData", new String(bArr, 0, i11, Charset.forName(str)));
                    HashMap map2 = new HashMap();
                    map2.put("chunkId", string);
                    map2.put("chunkTotal", Integer.valueOf((int) dCeil));
                    int i12 = i10 + 1;
                    map2.put("chunkSequenceNumber", Integer.valueOf(i10));
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new C6430l(c6430l.f62276b, c6430l.f62277c, map2, map, c6430l.f62280f));
                    arrayList = arrayList2;
                    i10 = i12;
                    str = str2;
                }
            } catch (IOException e10) {
                Q5.t.f("Assurance", "OutboundEventQueueWorker", "Failed to chunk event with ID: %s. Exception: %s", c6430l.f62275a, e10.getMessage());
                return Collections.EMPTY_LIST;
            }
        }

        a(int i10) {
            this.f62180a = i10;
        }
    }

    M(ExecutorService executorService, G g10, C6422d c6422d) {
        this(executorService, g10, c6422d, new LinkedBlockingQueue(), new a(f62175k));
    }

    void i() {
        this.f62179i = false;
    }

    void m() {
        this.f62179i = true;
        f();
    }

    M(ExecutorService executorService, G g10, C6422d c6422d, LinkedBlockingQueue<C6430l> linkedBlockingQueue, a aVar) {
        super(executorService, linkedBlockingQueue);
        this.f62176f = g10;
        this.f62177g = c6422d;
        this.f62178h = aVar;
        this.f62179i = false;
    }

    private void l(C6430l c6430l) {
        if (c6430l == null) {
            Q5.t.b("Assurance", "OutboundEventQueueWorker", "Cannot send null event.", new Object[0]);
            return;
        }
        try {
            byte[] bytes = c6430l.d().getBytes(Charset.forName("UTF-8"));
            if (bytes.length < f62174j) {
                this.f62176f.q(bytes);
                return;
            }
            if (c6430l.e() == null) {
                Q5.t.f("Assurance", "OutboundEventQueueWorker", "Cannot send eventId: %s that exceeds permitted limitbut has an empty payload!", c6430l.f62275a);
                return;
            }
            Iterator<C6430l> it = this.f62178h.a(c6430l).iterator();
            while (it.hasNext()) {
                this.f62176f.q(it.next().d().getBytes(Charset.forName("UTF-8")));
            }
        } catch (UnsupportedCharsetException e10) {
            Q5.t.b("Assurance", "OutboundEventQueueWorker", String.format("UnsupportedCharsetException while converting Assurance event object to bytes representation: %s", e10.getLocalizedMessage()), new Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    protected boolean a() {
        G g10;
        return this.f62179i && (g10 = this.f62176f) != null && g10.l() == G.c.OPEN;
    }

    void k() {
        if (this.f62179i) {
            return;
        }
        Q5.t.a("Assurance", "OutboundEventQueueWorker", "Sending client info event to Assurance", new Object[0]);
        l(new C6430l("client", this.f62177g.c()));
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    protected void e() {
        k();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    void h() {
        super.h();
        this.f62179i = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adobe.marketing.mobile.assurance.internal.I
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(C6430l c6430l) {
        l(c6430l);
    }
}
