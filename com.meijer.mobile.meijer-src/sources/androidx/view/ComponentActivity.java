package androidx.view;

import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.r;
import androidx.core.app.s;
import androidx.core.app.v;
import androidx.view.AbstractC6165l;
import androidx.view.C6141O;
import androidx.view.C6146U;
import androidx.view.C6161i0;
import androidx.view.C6163j0;
import androidx.view.C6174u;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC6162j;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import androidx.view.ReportFragment;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import f.C13891a;
import f.InterfaceC13892b;
import g.AbstractC14276c;
import g.AbstractC14278e;
import g.C14280g;
import g.InterfaceC14275b;
import g.InterfaceC14279f;
import h.AbstractC14427a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o2.InterfaceC16068a;
import p2.C16389x;
import p2.InterfaceC16383u;
import p2.InterfaceC16392z;
import x4.C18086f;
import x4.C18088h;
import x4.C18093m;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e:\nÝ\u0001Þ\u0001ß\u0001à\u0001á\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001dH\u0015¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b%\u0010$J\u0019\u0010'\u001a\u00020\u00142\b\b\u0001\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u0013J\u0019\u0010'\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b'\u0010*J#\u0010'\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b'\u0010-J#\u0010.\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0014H\u0017¢\u0006\u0004\b/\u0010\u0010J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J)\u0010<\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\u0003H\u0016¢\u0006\u0004\bH\u0010KJ'\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\u00032\u0006\u0010M\u001a\u00020LH\u0017¢\u0006\u0004\bH\u0010NJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bO\u0010IJ\u000f\u0010P\u001a\u00020\u0014H\u0016¢\u0006\u0004\bP\u0010\u0010J\u000f\u0010Q\u001a\u00020\u0014H\u0017¢\u0006\u0004\bQ\u0010\u0010J\u001f\u0010U\u001a\u00020\u00142\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0011H\u0017¢\u0006\u0004\bU\u0010VJ)\u0010U\u001a\u00020\u00142\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\bU\u0010XJA\u0010^\u001a\u00020\u00142\u0006\u0010S\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010R2\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u0011H\u0017¢\u0006\u0004\b^\u0010_JK\u0010^\u001a\u00020\u00142\u0006\u0010S\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010R2\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b^\u0010`J)\u0010c\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u00112\b\u0010b\u001a\u0004\u0018\u00010RH\u0015¢\u0006\u0004\bc\u0010dJ-\u0010j\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u00112\f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010kJI\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010l\"\u0004\b\u0001\u0010m2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00010r¢\u0006\u0004\bu\u0010vJA\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010l\"\u0004\b\u0001\u0010m2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010n2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00010r¢\u0006\u0004\bu\u0010wJ\u0017\u0010z\u001a\u00020\u00142\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0004\bz\u0010{J\u001b\u0010}\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020x0|¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020x0|¢\u0006\u0004\b\u007f\u0010~J\u001a\u0010\u0081\u0001\u001a\u00020\u00142\u0007\u0010\u0080\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0081\u0001\u0010\u0013J\u001d\u0010\u0082\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110|¢\u0006\u0005\b\u0082\u0001\u0010~J\u001d\u0010\u0083\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110|¢\u0006\u0005\b\u0083\u0001\u0010~J\u001a\u0010\u0084\u0001\u001a\u00020\u00142\u0006\u0010S\u001a\u00020RH\u0015¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001d\u0010\u0086\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020R0|¢\u0006\u0005\b\u0086\u0001\u0010~J\u001d\u0010\u0087\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020R0|¢\u0006\u0005\b\u0087\u0001\u0010~J\u001b\u0010\u0089\u0001\u001a\u00020\u00142\u0007\u0010\u0088\u0001\u001a\u00020;H\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J#\u0010\u0089\u0001\u001a\u00020\u00142\u0007\u0010\u0088\u0001\u001a\u00020;2\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0006\b\u0089\u0001\u0010\u008b\u0001J\u001e\u0010\u008d\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010|¢\u0006\u0005\b\u008d\u0001\u0010~J\u001e\u0010\u008e\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010|¢\u0006\u0005\b\u008e\u0001\u0010~J\u001b\u0010\u0090\u0001\u001a\u00020\u00142\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u008a\u0001J#\u0010\u0090\u0001\u001a\u00020\u00142\u0007\u0010\u008f\u0001\u001a\u00020;2\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u008b\u0001J\u001e\u0010\u0092\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010|¢\u0006\u0005\b\u0092\u0001\u0010~J\u001e\u0010\u0093\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010|¢\u0006\u0005\b\u0093\u0001\u0010~J\u0011\u0010\u0094\u0001\u001a\u00020\u0014H\u0015¢\u0006\u0005\b\u0094\u0001\u0010\u0010J\u0019\u0010\u0096\u0001\u001a\u00020\u00142\u0007\u00104\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u00142\u0007\u00104\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0099\u0001\u0010\u0010R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u0012\u0005\b£\u0001\u0010\u0010R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0017\u0010§\u0001\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010lR\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010²\u0001\u001a\u00020p8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0|0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110|0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0|0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010|0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¸\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010|0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¸\u0001R\u0019\u0010¾\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010«\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R'\u0010Ê\u0001\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÆ\u0001\u0010«\u0001\u0012\u0005\bÉ\u0001\u0010\u0010\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010$R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010Û\u0001\u001a\u00030Ø\u00018F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006â\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/h0;", "Landroidx/lifecycle/j;", "Lx4/i;", "Landroidx/activity/J;", "Lg/f;", "LZ1/c;", "LZ1/d;", "Landroidx/core/app/r;", "Landroidx/core/app/s;", "Lp2/u;", "Landroidx/activity/E;", "<init>", "()V", "", "contentLayoutId", "(I)V", "", "ensureViewModelStore", "Landroidx/activity/G;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/G;)V", "Landroidx/activity/ComponentActivity$e;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$e;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lf/b;", "listener", "addOnContextAvailableListener", "(Lf/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lp2/z;", "provider", "addMenuProvider", "(Lp2/z;)V", "owner", "(Lp2/z;Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l$b;", "state", "(Lp2/z;Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/e;", "registry", "Lg/b;", "callback", "Lg/c;", "registerForActivityResult", "(Lh/a;Lg/e;Lg/b;)Lg/c;", "(Lh/a;Lg/b;)Lg/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lo2/a;", "addOnConfigurationChangedListener", "(Lo2/a;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/j;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/v;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lf/a;", "contextAwareHelper", "Lf/a;", "Lp2/x;", "menuHostHelper", "Lp2/x;", "Lx4/h;", "savedStateRegistryController", "Lx4/h;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/g0;", "_viewModelStore", "Landroidx/lifecycle/g0;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$e;", "Landroidx/activity/D;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Landroidx/activity/D;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lg/e;", "getActivityResultRegistry", "()Lg/e;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/f0$c;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/f0$c;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/G;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/g0;", "viewModelStore", "LV2/a;", "getDefaultViewModelCreationExtras", "()LV2/a;", "defaultViewModelCreationExtras", "Lx4/f;", "getSavedStateRegistry", "()Lx4/f;", "savedStateRegistry", "Companion", "b", "c", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC6172s, h0, InterfaceC6162j, InterfaceC18089i, J, InterfaceC14279f, Z1.c, Z1.d, r, s, InterfaceC16383u, E {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private g0 _viewModelStore;
    private final AbstractC14278e activityResultRegistry;
    private int contentLayoutId;
    private final C13891a contextAwareHelper;

    /* renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final Lazy fullyDrawnReporter;
    private final C16389x menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC16068a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC16068a<androidx.core.app.j>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC16068a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC16068a<v>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC16068a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final C18088h savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/activity/ComponentActivity$a", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements InterfaceC6169p {
        a() {
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
            Intrinsics.j(source, "source");
            Intrinsics.j(event, "event");
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/ComponentActivity$b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45869a = new b();

        public final OnBackInvokedDispatcher a(Activity activity) {
            Intrinsics.j(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            Intrinsics.i(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$c;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity$d;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/g0;", "b", "Landroidx/lifecycle/g0;", "()Landroidx/lifecycle/g0;", "d", "(Landroidx/lifecycle/g0;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object custom;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private g0 viewModelStore;

        /* renamed from: a, reason: from getter */
        public final Object getCustom() {
            return this.custom;
        }

        /* renamed from: b, reason: from getter */
        public final g0 getViewModelStore() {
            return this.viewModelStore;
        }

        public final void c(Object obj) {
            this.custom = obj;
        }

        public final void d(g0 g0Var) {
            this.viewModelStore = g0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$e;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "", "B", "(Landroid/view/View;)V", "l", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface e extends Executor {
        void B(View view);

        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/activity/ComponentActivity$f;", "Landroidx/activity/ComponentActivity$e;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", "", "B", "(Landroid/view/View;)V", "l", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "a", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Runnable currentRunnable;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean onDrawScheduled;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.g(runnable);
                runnable.run();
                fVar.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.e
        public void B(View view) {
            Intrinsics.j(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.j(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.i(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.b(this.f45939a);
                    }
                });
            } else if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.e
        public void l() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$g", "Lg/e;", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Landroidx/core/app/d;", "options", "", "i", "(ILh/a;Ljava/lang/Object;Landroidx/core/app/d;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends AbstractC14278e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // g.AbstractC14278e
        public <I, O> void i(final int requestCode, AbstractC14427a<I, O> contract, I input, androidx.core.app.d options) {
            Bundle bundleE;
            final int i10;
            Intrinsics.j(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC14427a.C2131a<O> c2131aB = contract.b(componentActivity, input);
            if (c2131aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.s(this.f45940a, requestCode, c2131aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(componentActivity, input);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                Intrinsics.g(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleE = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleE = options != null ? options.e() : null;
            }
            Bundle bundle = bundleE;
            if (Intrinsics.e("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.v(componentActivity, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.e("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                androidx.core.app.b.z(componentActivity, intentA, requestCode, bundle);
                return;
            }
            C14280g c14280g = (C14280g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.g(c14280g);
                i10 = requestCode;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i10 = requestCode;
            }
            try {
                androidx.core.app.b.A(componentActivity, c14280g.getIntentSender(), i10, c14280g.getFillInIntent(), c14280g.getFlagsMask(), c14280g.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.g.t(this.f45943a, i10, sendIntentException);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g gVar, int i10, AbstractC14427a.C2131a c2131a) {
            gVar.f(i10, c2131a.a());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/U;", "c", "()Landroidx/lifecycle/U;"}, k = 3, mv = {1, 8, 0})
    static final class h extends Lambda implements Function0<C6146U> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6146U invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new C6146U(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/D;", "c", "()Landroidx/activity/D;"}, k = 3, mv = {1, 8, 0})
    static final class i extends Lambda implements Function0<D> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f45879f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f45879f = componentActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f45879f.reportFullyDrawn();
            }
        }

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final D invoke() {
            return new D(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/G;", "c", "()Landroidx/activity/G;"}, k = 3, mv = {1, 8, 0})
    static final class j extends Lambda implements Function0<G> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final G g10 = new G(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.j.d(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.j.e(componentActivity2, g10);
                        }
                    });
                    return g10;
                }
                componentActivity2.addObserverForBackInvoker(g10);
            }
            return g10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ComponentActivity componentActivity) {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (Intrinsics.e(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!Intrinsics.e(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ComponentActivity componentActivity, G g10) {
            componentActivity.addObserverForBackInvoker(g10);
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C13891a();
        this.menuHostHelper = new C16389x(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f45932a.invalidateMenu();
            }
        });
        C18088h c18088hB = C18088h.INSTANCE.b(this);
        this.savedStateRegistryController = c18088hB;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = LazyKt.b(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC6169p() { // from class: androidx.activity.e
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                ComponentActivity._init_$lambda$2(this.f45933a, interfaceC6172s, aVar);
            }
        });
        getLifecycle().a(new InterfaceC6169p() { // from class: androidx.activity.f
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                ComponentActivity._init_$lambda$3(this.f45934a, interfaceC6172s, aVar);
            }
        });
        getLifecycle().a(new a());
        c18088hB.c();
        C6141O.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C18086f.b() { // from class: androidx.activity.g
            @Override // x4.C18086f.b
            public final Bundle saveState() {
                return ComponentActivity._init_$lambda$4(this.f45935a);
            }
        });
        addOnContextAvailableListener(new InterfaceC13892b() { // from class: androidx.activity.h
            @Override // f.InterfaceC13892b
            public final void a(Context context) {
                ComponentActivity._init_$lambda$5(this.f45936a, context);
            }
        });
        this.defaultViewModelProviderFactory = LazyKt.b(new h());
        this.onBackPressedDispatcher = LazyKt.b(new j());
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // p2.InterfaceC16383u
    public void addMenuProvider(InterfaceC16392z provider) {
        Intrinsics.j(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC16068a<androidx.core.app.j>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.j(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC16068a<v>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new v(isInPictureInPictureMode));
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final <I, O> AbstractC14276c<I> registerForActivityResult(AbstractC14427a<I, O> contract, AbstractC14278e registry, InterfaceC14275b<O> callback) {
        Intrinsics.j(contract, "contract");
        Intrinsics.j(registry, "registry");
        Intrinsics.j(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        eVar.B(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int requestCode) {
        Intrinsics.j(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.j(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.j(interfaceC6172s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        if (event != AbstractC6165l.a.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
        Intrinsics.j(interfaceC6172s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        if (event == AbstractC6165l.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String().a();
            }
            componentActivity.reportFullyDrawnExecutor.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        Intrinsics.j(it, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            componentActivity.activityResultRegistry.j(bundleA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(G g10, ComponentActivity componentActivity, InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
        Intrinsics.j(interfaceC6172s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        if (event == AbstractC6165l.a.ON_CREATE) {
            g10.o(b.f45869a.a(componentActivity));
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new g0();
            }
        }
    }

    public void addMenuProvider(InterfaceC16392z provider, InterfaceC6172s owner) {
        Intrinsics.j(provider, "provider");
        Intrinsics.j(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // Z1.c
    public final void addOnConfigurationChangedListener(InterfaceC16068a<Configuration> listener) {
        Intrinsics.j(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC13892b listener) {
        Intrinsics.j(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnMultiWindowModeChangedListener(InterfaceC16068a<androidx.core.app.j> listener) {
        Intrinsics.j(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(InterfaceC16068a<Intent> listener) {
        Intrinsics.j(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.s
    public final void addOnPictureInPictureModeChangedListener(InterfaceC16068a<v> listener) {
        Intrinsics.j(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // Z1.d
    public final void addOnTrimMemoryListener(InterfaceC16068a<Integer> listener) {
        Intrinsics.j(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.j(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // g.InterfaceC14279f
    public final AbstractC14278e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC6162j
    public CreationExtras getDefaultViewModelCreationExtras() {
        V2.b bVar = new V2.b(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            CreationExtras.c<Application> cVar = f0.a.f55485h;
            Application application = getApplication();
            Intrinsics.i(application, "application");
            bVar.c(cVar, application);
        }
        bVar.c(C6141O.f55430a, this);
        bVar.c(C6141O.f55431b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(C6141O.f55432c, extras);
        }
        return bVar;
    }

    @Override // androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        return (f0.c) this.defaultViewModelProviderFactory.getValue();
    }

    public D getFullyDrawnReporter() {
        return (D) this.fullyDrawnReporter.getValue();
    }

    @Override // androidx.view.J
    public final G getOnBackPressedDispatcher() {
        return (G) this.onBackPressedDispatcher.getValue();
    }

    @Override // x4.InterfaceC18089i
    public final C18086f getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.e(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC16068a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        ReportFragment.INSTANCE.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Intrinsics.j(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        Intrinsics.j(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.j(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC16068a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        Intrinsics.j(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Intrinsics.j(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.j(permissions, "permissions");
        Intrinsics.j(grantResults, "grantResults");
        if (this.activityResultRegistry.e(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        if (getLifecycle() instanceof C6174u) {
            AbstractC6165l lifecycle = getLifecycle();
            Intrinsics.h(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C6174u) lifecycle).n(AbstractC6165l.b.f55501c);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getContext();
    }

    @Override // p2.InterfaceC16383u
    public void removeMenuProvider(InterfaceC16392z provider) {
        Intrinsics.j(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // Z1.c
    public final void removeOnConfigurationChangedListener(InterfaceC16068a<Configuration> listener) {
        Intrinsics.j(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC13892b listener) {
        Intrinsics.j(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnMultiWindowModeChangedListener(InterfaceC16068a<androidx.core.app.j> listener) {
        Intrinsics.j(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(InterfaceC16068a<Intent> listener) {
        Intrinsics.j(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.s
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC16068a<v> listener) {
        Intrinsics.j(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // Z1.d
    public final void removeOnTrimMemoryListener(InterfaceC16068a<Integer> listener) {
        Intrinsics.j(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.j(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.j(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.j(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final G dispatcher) {
        getLifecycle().a(new InterfaceC6169p() { // from class: androidx.activity.i
            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(dispatcher, this, interfaceC6172s, aVar);
            }
        });
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        eVar.B(decorView);
        super.addContentView(view, params);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC16392z provider, InterfaceC6172s owner, AbstractC6165l.b state) {
        Intrinsics.j(provider, "provider");
        Intrinsics.j(owner, "owner");
        Intrinsics.j(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.view.InterfaceC6172s
    public AbstractC6165l getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.view.h0
    /* renamed from: getViewModelStore */
    public g0 getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
        if (getApplication() != null) {
            ensureViewModelStore();
            g0 g0Var = this._viewModelStore;
            Intrinsics.g(g0Var);
            return g0Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        C6161i0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.i(decorView2, "window.decorView");
        C6163j0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.i(decorView3, "window.decorView");
        C18093m.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.i(decorView4, "window.decorView");
        C5754N.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.i(decorView5, "window.decorView");
        View.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        g0 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            viewModelStore = dVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(viewModelStore);
        return dVar2;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC16068a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> AbstractC14276c<I> registerForActivityResult(AbstractC14427a<I, O> contract, InterfaceC14275b<O> callback) {
        Intrinsics.j(contract, "contract");
        Intrinsics.j(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (H4.a.h()) {
                H4.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            H4.a.f();
        } catch (Throwable th2) {
            H4.a.f();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Intrinsics.j(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC16068a<androidx.core.app.j>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.j(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Intrinsics.j(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC16068a<v>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new v(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        eVar.B(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        eVar.B(decorView);
        super.setContentView(view, params);
    }

    public ComponentActivity(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
