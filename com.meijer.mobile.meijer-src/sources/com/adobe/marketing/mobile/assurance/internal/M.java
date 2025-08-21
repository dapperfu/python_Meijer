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
class M extends I<C6555l> {

    /* renamed from: j, reason: collision with root package name */
    static final int f63013j = (int) Math.floor(24576.0d);

    /* renamed from: k, reason: collision with root package name */
    static final int f63014k = (int) Math.floor(11520.0d);

    /* renamed from: f, reason: collision with root package name */
    private final G f63015f;

    /* renamed from: g, reason: collision with root package name */
    private final C6547d f63016g;

    /* renamed from: h, reason: collision with root package name */
    private final a f63017h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f63018i;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f63019a;

        public List<C6555l> a(C6555l c6555l) throws IOException {
            if (c6555l == null) {
                return Collections.EMPTY_LIST;
            }
            if (c6555l.e() == null) {
                R5.t.f("Assurance", "OutboundEventQueueWorker", "Cannot chunk event: %s with an empty payload!", c6555l.f63114a);
                return Collections.singletonList(c6555l);
            }
            String str = "UTF-8";
            byte[] bytes = new JSONObject(c6555l.e()).toString().getBytes(Charset.forName("UTF-8"));
            if (bytes.length < this.f63019a) {
                return Collections.singletonList(c6555l);
            }
            ArrayList arrayList = new ArrayList();
            double dCeil = Math.ceil(bytes.length / this.f63019a);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[this.f63019a];
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
                    arrayList2.add(new C6555l(c6555l.f63115b, c6555l.f63116c, map2, map, c6555l.f63119f));
                    arrayList = arrayList2;
                    i10 = i12;
                    str = str2;
                }
            } catch (IOException e10) {
                R5.t.f("Assurance", "OutboundEventQueueWorker", "Failed to chunk event with ID: %s. Exception: %s", c6555l.f63114a, e10.getMessage());
                return Collections.EMPTY_LIST;
            }
        }

        a(int i10) {
            this.f63019a = i10;
        }
    }

    M(ExecutorService executorService, G g10, C6547d c6547d) {
        this(executorService, g10, c6547d, new LinkedBlockingQueue(), new a(f63014k));
    }

    void i() {
        this.f63018i = false;
    }

    void m() {
        this.f63018i = true;
        f();
    }

    M(ExecutorService executorService, G g10, C6547d c6547d, LinkedBlockingQueue<C6555l> linkedBlockingQueue, a aVar) {
        super(executorService, linkedBlockingQueue);
        this.f63015f = g10;
        this.f63016g = c6547d;
        this.f63017h = aVar;
        this.f63018i = false;
    }

    private void l(C6555l c6555l) {
        if (c6555l == null) {
            R5.t.b("Assurance", "OutboundEventQueueWorker", "Cannot send null event.", new Object[0]);
            return;
        }
        try {
            byte[] bytes = c6555l.d().getBytes(Charset.forName("UTF-8"));
            if (bytes.length < f63013j) {
                this.f63015f.q(bytes);
                return;
            }
            if (c6555l.e() == null) {
                R5.t.f("Assurance", "OutboundEventQueueWorker", "Cannot send eventId: %s that exceeds permitted limitbut has an empty payload!", c6555l.f63114a);
                return;
            }
            Iterator<C6555l> it = this.f63017h.a(c6555l).iterator();
            while (it.hasNext()) {
                this.f63015f.q(it.next().d().getBytes(Charset.forName("UTF-8")));
            }
        } catch (UnsupportedCharsetException e10) {
            R5.t.b("Assurance", "OutboundEventQueueWorker", String.format("UnsupportedCharsetException while converting Assurance event object to bytes representation: %s", e10.getLocalizedMessage()), new Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    protected boolean a() {
        G g10;
        return this.f63018i && (g10 = this.f63015f) != null && g10.l() == G.c.OPEN;
    }

    void k() {
        if (this.f63018i) {
            return;
        }
        R5.t.a("Assurance", "OutboundEventQueueWorker", "Sending client info event to Assurance", new Object[0]);
        l(new C6555l("client", this.f63016g.c()));
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    protected void e() {
        k();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.I
    void h() {
        super.h();
        this.f63018i = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adobe.marketing.mobile.assurance.internal.I
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(C6555l c6555l) {
        l(c6555l);
    }
}
