package Z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f43585f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f43586g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f43587a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f43588b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f43589c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f43590d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f43591e;

    /* renamed from: Z2.a$a, reason: collision with other inner class name */
    class HandlerC0922a extends Handler {
        HandlerC0922a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f43595a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f43596b;

        /* renamed from: c, reason: collision with root package name */
        boolean f43597c;

        /* renamed from: d, reason: collision with root package name */
        boolean f43598d;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f43596b);
            sb2.append(" filter=");
            sb2.append(this.f43595a);
            if (this.f43598d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f43595a = intentFilter;
            this.f43596b = broadcastReceiver;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f43593a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f43594b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f43593a = intent;
            this.f43594b = arrayList;
        }
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f43585f) {
            try {
                if (f43586g == null) {
                    f43586g = new a(context.getApplicationContext());
                }
                aVar = f43586g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f43588b) {
                try {
                    size = this.f43590d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f43590d.toArray(bVarArr);
                    this.f43590d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f43594b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f43594b.get(i11);
                    if (!cVar.f43598d) {
                        cVar.f43596b.onReceive(this.f43587a, bVar.f43593a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f43588b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f43588b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f43588b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f43589c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f43589c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        synchronized (this.f43588b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f43587a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    FS.log_v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f43589c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        FS.log_v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        c cVar = arrayList.get(i10);
                        if (z10) {
                            FS.log_v("LocalBroadcastManager", "Matching against filter " + cVar.f43595a);
                        }
                        if (cVar.f43597c) {
                            if (z10) {
                                FS.log_v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int iMatch = cVar.f43595a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb2 = new StringBuilder();
                                    str = action;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    FS.log_v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f43597c = true;
                            } else {
                                str = action;
                                if (z10) {
                                    FS.log_v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i10++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f43597c = false;
                        }
                        this.f43590d.add(new b(intent, arrayList2));
                        if (!this.f43591e.hasMessages(1)) {
                            this.f43591e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f43588b) {
            try {
                ArrayList<c> arrayListRemove = this.f43588b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f43598d = true;
                    for (int i10 = 0; i10 < cVar.f43595a.countActions(); i10++) {
                        String action = cVar.f43595a.getAction(i10);
                        ArrayList<c> arrayList = this.f43589c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f43596b == broadcastReceiver) {
                                    cVar2.f43598d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f43589c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private a(Context context) {
        this.f43587a = context;
        this.f43591e = new HandlerC0922a(context.getMainLooper());
    }
}
