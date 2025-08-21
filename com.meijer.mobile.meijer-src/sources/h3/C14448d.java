package h3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.video.h;
import java.util.ArrayList;
import m3.InterfaceC15658c;
import r3.C16832i;
import r3.InterfaceC16831h;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C14448d implements L {

    /* renamed from: a, reason: collision with root package name */
    private final Context f134702a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.g f134703b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f134706e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f134708g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f134709h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f134710i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f134711j;

    /* renamed from: c, reason: collision with root package name */
    private int f134704c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f134705d = 5000;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.l f134707f = androidx.media3.exoplayer.mediacodec.l.f56729a;

    /* renamed from: k, reason: collision with root package name */
    private long f134712k = -9223372036854775807L;

    protected void h(Context context, Handler handler, int i10, ArrayList<H0> arrayList) {
    }

    @Override // h3.L
    public H0[] a(Handler handler, androidx.media3.exoplayer.video.p pVar, androidx.media3.exoplayer.audio.e eVar, InterfaceC16831h interfaceC16831h, o3.b bVar) {
        Handler handler2;
        ArrayList<H0> arrayList = new ArrayList<>();
        k(this.f134702a, this.f134704c, this.f134707f, this.f134706e, handler, pVar, this.f134705d, arrayList);
        AudioSink audioSinkD = d(this.f134702a, this.f134708g, this.f134709h);
        if (audioSinkD != null) {
            handler2 = handler;
            c(this.f134702a, this.f134704c, this.f134707f, this.f134706e, audioSinkD, handler2, eVar, arrayList);
        } else {
            handler2 = handler;
        }
        j(this.f134702a, interfaceC16831h, handler2.getLooper(), this.f134704c, arrayList);
        g(this.f134702a, bVar, handler2.getLooper(), this.f134704c, arrayList);
        e(this.f134702a, this.f134704c, arrayList);
        f(arrayList);
        h(this.f134702a, handler2, this.f134704c, arrayList);
        return (H0[]) arrayList.toArray(new H0[0]);
    }

    protected void c(Context context, int i10, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, AudioSink audioSink, Handler handler, androidx.media3.exoplayer.audio.e eVar, ArrayList<H0> arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        arrayList.add(new androidx.media3.exoplayer.audio.m(context, l(), lVar, z10, handler, eVar, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (H0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                d3.r.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (H0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        try {
                            i13 = i12 + 1;
                            arrayList.add(i12, (H0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                            d3.r.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            i14 = i13 + 1;
                            try {
                                arrayList.add(i13, (H0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                                d3.r.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i13 = i14;
                                i14 = i13;
                                try {
                                    int i15 = i14 + 1;
                                    arrayList.add(i14, (H0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                                    d3.r.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused6) {
                                }
                                arrayList.add(i15, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                                d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            int i152 = i14 + 1;
                            try {
                                arrayList.add(i14, (H0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                                d3.r.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i14 = i152;
                                i152 = i14;
                                arrayList.add(i152, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                                d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            }
                            arrayList.add(i152, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                            d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        } catch (Exception e10) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e10);
                        }
                    }
                } catch (ClassNotFoundException unused9) {
                }
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (H0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused10) {
                        i12 = i13;
                        i13 = i12;
                        i14 = i13 + 1;
                        arrayList.add(i13, (H0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        int i1522 = i14 + 1;
                        arrayList.add(i14, (H0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i1522, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    }
                    try {
                        i14 = i13 + 1;
                        arrayList.add(i13, (H0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        int i15222 = i14 + 1;
                        arrayList.add(i14, (H0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i15222, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    } catch (Exception e11) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e11);
                    }
                } catch (Exception e12) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e12);
                }
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (H0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                d3.r.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                i13 = i12 + 1;
                arrayList.add(i12, (H0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                d3.r.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                i14 = i13 + 1;
                arrayList.add(i13, (H0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                d3.r.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                int i152222 = i14 + 1;
                arrayList.add(i14, (H0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                d3.r.g("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i152222, (H0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                    d3.r.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating Opus extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating MIDI extension", e15);
        }
    }

    protected AudioSink d(Context context, boolean z10, boolean z11) {
        return new DefaultAudioSink.g(context).l(z10).k(z11).j();
    }

    protected void e(Context context, int i10, ArrayList<H0> arrayList) {
        arrayList.add(new w3.b());
    }

    protected void f(ArrayList<H0> arrayList) {
        arrayList.add(new m3.e(m(), null));
    }

    protected void g(Context context, o3.b bVar, Looper looper, int i10, ArrayList<H0> arrayList) {
        arrayList.add(new o3.c(bVar, looper));
        arrayList.add(new o3.c(bVar, looper));
    }

    protected H0 i(H0 h02, Context context, int i10, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, androidx.media3.exoplayer.video.p pVar, long j10) {
        if (this.f134710i && h02.getClass() == androidx.media3.exoplayer.video.h.class) {
            return new h.d(context).q(l()).v(lVar).p(j10).r(z10).s(handler).t(pVar).u(50).o(this.f134711j).n(this.f134712k).m();
        }
        return null;
    }

    protected void j(Context context, InterfaceC16831h interfaceC16831h, Looper looper, int i10, ArrayList<H0> arrayList) {
        arrayList.add(new C16832i(interfaceC16831h, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|(1:7)|39|8|9|(2:44|10)|37|18|19|42|20|(3:45|28|47)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r9 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void k(android.content.Context r15, int r16, androidx.media3.exoplayer.mediacodec.l r17, boolean r18, android.os.Handler r19, androidx.media3.exoplayer.video.p r20, long r21, java.util.ArrayList<androidx.media3.exoplayer.H0> r23) {
        /*
            r14 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r23
            java.lang.String r4 = "DefaultRenderersFactory"
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class<androidx.media3.exoplayer.video.p> r6 = androidx.media3.exoplayer.video.p.class
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            java.lang.Class r8 = java.lang.Long.TYPE
            androidx.media3.exoplayer.video.h$d r9 = new androidx.media3.exoplayer.video.h$d
            r10 = r15
            r9.<init>(r15)
            androidx.media3.exoplayer.mediacodec.h$b r10 = r14.l()
            androidx.media3.exoplayer.video.h$d r9 = r9.q(r10)
            r10 = r17
            androidx.media3.exoplayer.video.h$d r9 = r9.v(r10)
            r10 = r21
            androidx.media3.exoplayer.video.h$d r9 = r9.p(r10)
            r12 = r18
            androidx.media3.exoplayer.video.h$d r9 = r9.r(r12)
            androidx.media3.exoplayer.video.h$d r9 = r9.s(r1)
            androidx.media3.exoplayer.video.h$d r9 = r9.t(r2)
            r12 = 50
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            androidx.media3.exoplayer.video.h$d r9 = r9.u(r12)
            boolean r12 = r14.f134711j
            androidx.media3.exoplayer.video.h$d r9 = r9.o(r12)
            long r10 = r14.f134712k
            androidx.media3.exoplayer.video.h$d r9 = r9.n(r10)
            androidx.media3.exoplayer.video.h r9 = r9.m()
            r3.add(r9)
            if (r0 != 0) goto L5b
            goto Lfa
        L5b:
            int r9 = r3.size()
            r10 = 2
            if (r0 != r10) goto L64
            int r9 = r9 + (-1)
        L64:
            java.lang.String r0 = "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Class[] r10 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.reflect.Constructor r0 = r0.getConstructor(r10)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Long r10 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r1, r2, r13}     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            java.lang.Object r0 = r0.newInstance(r10)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            androidx.media3.exoplayer.H0 r0 = (androidx.media3.exoplayer.H0) r0     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L97
            int r10 = r9 + 1
            r3.add(r9, r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L8d
            java.lang.String r0 = "Loaded LibvpxVideoRenderer."
            d3.r.g(r4, r0)     // Catch: java.lang.Exception -> L8b java.lang.ClassNotFoundException -> L8d
            goto L98
        L8b:
            r0 = move-exception
            goto L8f
        L8d:
            r9 = r10
            goto L97
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L97:
            r10 = r9
        L98:
            java.lang.String r0 = "androidx.media3.decoder.av1.Libgav1VideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Class[] r9 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.reflect.Constructor r0 = r0.getConstructor(r9)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Long r9 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r1, r2, r13}     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            java.lang.Object r0 = r0.newInstance(r9)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            androidx.media3.exoplayer.H0 r0 = (androidx.media3.exoplayer.H0) r0     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lcb
            int r9 = r10 + 1
            r3.add(r10, r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            d3.r.g(r4, r0)     // Catch: java.lang.Exception -> Lbf java.lang.ClassNotFoundException -> Lc1
            goto Lcc
        Lbf:
            r0 = move-exception
            goto Lc3
        Lc1:
            r10 = r9
            goto Lcb
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        Lcb:
            r9 = r10
        Lcc:
            java.lang.String r0 = "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Class[] r5 = new java.lang.Class[]{r8, r7, r6, r5}     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2, r13}     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            androidx.media3.exoplayer.H0 r0 = (androidx.media3.exoplayer.H0) r0     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            r3.add(r9, r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            java.lang.String r0 = "Loaded FfmpegVideoRenderer."
            d3.r.g(r4, r0)     // Catch: java.lang.Exception -> Lf1 java.lang.ClassNotFoundException -> Lfa
            goto Lfa
        Lf1:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        Lfa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.C14448d.k(android.content.Context, int, androidx.media3.exoplayer.mediacodec.l, boolean, android.os.Handler, androidx.media3.exoplayer.video.p, long, java.util.ArrayList):void");
    }

    protected h.b l() {
        return this.f134703b;
    }

    protected InterfaceC15658c.a m() {
        return InterfaceC15658c.a.f150546a;
    }

    public C14448d(Context context) {
        this.f134702a = context;
        this.f134703b = new androidx.media3.exoplayer.mediacodec.g(context);
    }

    @Override // h3.L
    public H0 b(H0 h02, Handler handler, androidx.media3.exoplayer.video.p pVar, androidx.media3.exoplayer.audio.e eVar, InterfaceC16831h interfaceC16831h, o3.b bVar) {
        if (h02.g() == 2) {
            return i(h02, this.f134702a, this.f134704c, this.f134707f, this.f134706e, handler, pVar, this.f134705d);
        }
        return null;
    }
}
