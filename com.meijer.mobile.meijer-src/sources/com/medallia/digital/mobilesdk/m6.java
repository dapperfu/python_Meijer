package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONException;

/* loaded from: classes8.dex */
class m6 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f93387d = 5;

    /* renamed from: a, reason: collision with root package name */
    protected b f93388a;

    /* renamed from: b, reason: collision with root package name */
    private int f93389b;

    /* renamed from: c, reason: collision with root package name */
    private Queue<List<ResourceContract>> f93390c;

    class a implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResourceContract f93391a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f93392b;

        a(ResourceContract resourceContract, List list) {
            this.f93391a = resourceContract;
            this.f93392b = list;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            m6.a(m6.this);
            a4.b(this.f93391a.getRemoteUrl() + " download failed");
            m6.this.f93388a.b(this.f93391a);
            m6.this.a((List<ResourceContract>) this.f93392b);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) throws JSONException {
            m6.a(m6.this);
            if (file != null) {
                a4.b(this.f93391a.getRemoteUrl() + " download complete");
                m6.this.f93388a.a(this.f93391a);
                f1.a().c(this.f93391a);
            } else {
                a4.b(this.f93391a.getRemoteUrl() + " download failed");
                m6.this.f93388a.b(this.f93391a);
            }
            m6.this.a((List<ResourceContract>) this.f93392b);
        }
    }

    protected interface b {
        void a(ResourceContract resourceContract);

        void b(ResourceContract resourceContract);
    }

    protected m6(List<ResourceContract> list, b bVar) {
        this(list, false, bVar);
    }

    static /* synthetic */ int a(m6 m6Var) {
        int i10 = m6Var.f93389b;
        m6Var.f93389b = i10 - 1;
        return i10;
    }

    private Queue<List<ResourceContract>> b(List<ResourceContract> list) {
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 5;
            linkedList.add(new ArrayList(list.subList(i10, Math.min(size, i11))));
            i10 = i11;
        }
        return linkedList;
    }

    void c(List<ResourceContract> list) throws JSONException {
        if (list == null) {
            return;
        }
        this.f93389b = list.size();
        for (ResourceContract resourceContract : list) {
            ResourceContract resourceContract2 = (ResourceContract) (resourceContract.getFormId() != null ? f1.a().b(b0.a.Resource, resourceContract.getRemoteUrl(), resourceContract.getFormId()) : f1.a().b(b0.a.Resource, resourceContract.getRemoteUrl()));
            if (resourceContract.equals(resourceContract2)) {
                a4.b(resourceContract2.getRemoteUrl() + " loaded from db");
                this.f93388a.a(resourceContract);
                this.f93389b = this.f93389b + (-1);
                a(list);
            } else {
                a(resourceContract2, resourceContract);
                a(resourceContract, list);
            }
        }
    }

    protected m6(List<ResourceContract> list, boolean z10, b bVar) throws JSONException {
        this.f93388a = bVar;
        if (list != null) {
            this.f93390c = b(a(list, z10));
            a();
        }
    }

    private List<ResourceContract> a(List<ResourceContract> list, boolean z10) {
        if (list == null) {
            return null;
        }
        if (z10) {
            Iterator<ResourceContract> it = list.iterator();
            while (it.hasNext()) {
                it.next().setGlobal(Boolean.TRUE);
            }
        }
        return list;
    }

    private void a() throws JSONException {
        Queue<List<ResourceContract>> queue = this.f93390c;
        if (queue == null) {
            return;
        }
        c(queue.poll());
    }

    void a(ResourceContract resourceContract, ResourceContract resourceContract2) throws JSONException {
        Boolean boolB;
        if (resourceContract == null || resourceContract2 == null) {
            return;
        }
        if ((resourceContract.getRemoteUrl().equals(resourceContract2.getRemoteUrl()) && resourceContract.getChecksum().equals(resourceContract2.getChecksum())) || (boolB = g2.b(resourceContract.getLocalUrl())) == null) {
            return;
        }
        AnalyticsBridge.getInstance().reportDeleteStorageEvent(resourceContract.getLocalUrl(), boolB.booleanValue());
    }

    private void a(ResourceContract resourceContract, List<ResourceContract> list) {
        s4.f().a(resourceContract.getRemoteUrl(), resourceContract.getLocalUrl(), new a(resourceContract, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<ResourceContract> list) throws JSONException {
        if (list == null || list.isEmpty() || this.f93389b != 0) {
            return;
        }
        a();
    }
}
