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
    private static final Object f42264f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f42265g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f42266a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f42267b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f42268c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f42269d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f42270e;

    /* renamed from: Z2.a$a, reason: collision with other inner class name */
    class HandlerC0895a extends Handler {
        HandlerC0895a(Looper looper) {
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
        final IntentFilter f42274a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f42275b;

        /* renamed from: c, reason: collision with root package name */
        boolean f42276c;

        /* renamed from: d, reason: collision with root package name */
        boolean f42277d;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f42275b);
            sb2.append(" filter=");
            sb2.append(this.f42274a);
            if (this.f42277d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f42274a = intentFilter;
            this.f42275b = broadcastReceiver;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f42272a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f42273b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f42272a = intent;
            this.f42273b = arrayList;
        }
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f42264f) {
            try {
                if (f42265g == null) {
                    f42265g = new a(context.getApplicationContext());
                }
                aVar = f42265g;
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
            synchronized (this.f42267b) {
                try {
                    size = this.f42269d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f42269d.toArray(bVarArr);
                    this.f42269d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f42273b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f42273b.get(i11);
                    if (!cVar.f42277d) {
                        cVar.f42275b.onReceive(this.f42266a, bVar.f42272a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f42267b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f42267b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f42267b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f42268c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f42268c.put(action, arrayList2);
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
        synchronized (this.f42267b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f42266a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    FS.log_v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f42268c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        FS.log_v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        c cVar = arrayList.get(i10);
                        if (z10) {
                            FS.log_v("LocalBroadcastManager", "Matching against filter " + cVar.f42274a);
                        }
                        if (cVar.f42276c) {
                            if (z10) {
                                FS.log_v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int iMatch = cVar.f42274a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
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
                                cVar.f42276c = true;
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
                            ((c) arrayList2.get(i11)).f42276c = false;
                        }
                        this.f42269d.add(new b(intent, arrayList2));
                        if (!this.f42270e.hasMessages(1)) {
                            this.f42270e.sendEmptyMessage(1);
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
        synchronized (this.f42267b) {
            try {
                ArrayList<c> arrayListRemove = this.f42267b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f42277d = true;
                    for (int i10 = 0; i10 < cVar.f42274a.countActions(); i10++) {
                        String action = cVar.f42274a.getAction(i10);
                        ArrayList<c> arrayList = this.f42268c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f42275b == broadcastReceiver) {
                                    cVar2.f42277d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f42268c.remove(action);
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
        this.f42266a = context;
        this.f42270e = new HandlerC0895a(context.getMainLooper());
    }
}
