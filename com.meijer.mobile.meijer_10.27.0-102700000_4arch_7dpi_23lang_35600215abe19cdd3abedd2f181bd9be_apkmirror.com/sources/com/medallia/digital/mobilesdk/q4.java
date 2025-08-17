package com.medallia.digital.mobilesdk;

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

/* loaded from: classes7.dex */
class q4 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f92729f = "LocalBroadcastManager";

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f92730g = false;

    /* renamed from: h, reason: collision with root package name */
    static final int f92731h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f92732i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static q4 f92733j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f92734a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f92735b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f92736c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f92737d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f92738e;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                q4.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f92740a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f92741b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f92740a = intent;
            this.f92741b = arrayList;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f92742a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f92743b;

        /* renamed from: c, reason: collision with root package name */
        boolean f92744c;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f92742a = intentFilter;
            this.f92743b = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.f92743b + " filter=" + this.f92742a + "}";
        }
    }

    private q4(Context context) {
        this.f92734a = context;
        this.f92738e = new a(context.getMainLooper());
    }

    public static q4 a(Context context) {
        q4 q4Var;
        synchronized (f92732i) {
            try {
                if (f92733j == null) {
                    f92733j = new q4(context.getApplicationContext());
                }
                q4Var = f92733j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q4Var;
    }

    public void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f92735b) {
                try {
                    size = this.f92737d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f92737d.toArray(bVarArr);
                    this.f92737d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                for (int i11 = 0; i11 < bVar.f92741b.size(); i11++) {
                    bVar.f92741b.get(i11).f92743b.onReceive(this.f92734a, bVar.f92740a);
                }
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f92735b) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f92735b.remove(broadcastReceiver);
                if (arrayListRemove != null) {
                    for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                        IntentFilter intentFilter = arrayListRemove.get(i10);
                        for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                            String action = intentFilter.getAction(i11);
                            ArrayList<c> arrayList = this.f92736c.get(action);
                            if (arrayList != null) {
                                int i12 = 0;
                                while (i12 < arrayList.size()) {
                                    if (arrayList.get(i12).f92743b == broadcastReceiver) {
                                        arrayList.remove(i12);
                                        i12--;
                                    }
                                    i12++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.f92736c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f92735b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.f92735b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f92735b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f92736c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f92736c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(Intent intent) {
        int i10;
        String str;
        String str2;
        synchronized (this.f92735b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f92734a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    FS.log_v(f92729f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f92736c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        FS.log_v(f92729f, "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        c cVar = arrayList.get(i11);
                        if (z10) {
                            StringBuilder sb2 = new StringBuilder();
                            i10 = i11;
                            sb2.append("Matching against filter ");
                            sb2.append(cVar.f92742a);
                            FS.log_v(f92729f, sb2.toString());
                        } else {
                            i10 = i11;
                        }
                        if (!cVar.f92744c) {
                            int iMatch = cVar.f92742a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f92729f);
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb3 = new StringBuilder();
                                    str = action;
                                    sb3.append("Filter matched! match=0x");
                                    sb3.append(Integer.toHexString(iMatch));
                                    FS.log_v(f92729f, sb3.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f92744c = true;
                            } else {
                                str = action;
                                if (z10) {
                                    str2 = "Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category");
                                    FS.log_v(f92729f, str2);
                                }
                            }
                        } else if (z10) {
                            str2 = "Filter's target already added";
                            str = action;
                            FS.log_v(f92729f, str2);
                        } else {
                            str = action;
                        }
                        i11 = i10 + 1;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((c) arrayList2.get(i12)).f92744c = false;
                        }
                        this.f92737d.add(new b(intent, arrayList2));
                        if (!this.f92738e.hasMessages(1)) {
                            this.f92738e.sendEmptyMessage(1);
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
}
