package com.meijer.mobile.storeinfo.api.model;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ok.StoreAuxUnitInfo;
import ok.StoreDetails;
import th.j;
import vk.C17590a;
import vk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\bo\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0001qB\u0093\b\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0003\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010 \u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010E\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010V\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u0002\u0012\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010Z\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010[\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010^\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010_\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010b\u001a\u0004\u0018\u00010a¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020 ¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020 ¢\u0006\u0004\bg\u0010fJ\u009c\b\u0010h\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\f\b\u0003\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010E\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010G\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010U\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010V\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00022\n\b\u0003\u0010Y\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010Z\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010[\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\\\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010]\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010^\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010_\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010`\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010b\u001a\u0004\u0018\u00010aHÆ\u0001¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\bl\u0010mJ\u001a\u0010o\u001a\u00020 2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bo\u0010pR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010kR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bu\u0010zR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b{\u0010r\u001a\u0004\b|\u0010tR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b}\u0010r\u001a\u0004\b~\u0010tR \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010r\u001a\u0005\b\u0080\u0001\u0010tR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010v\u001a\u0005\b\u0082\u0001\u0010kR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010v\u001a\u0005\b\u0084\u0001\u0010kR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010v\u001a\u0005\b\u0086\u0001\u0010kR\u001e\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0006¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010mR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\b\u008e\u0001\u0010v\u001a\u0004\bq\u0010kR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\b\u008f\u0001\u0010v\u001a\u0004\b{\u0010kR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010v\u001a\u0005\b\u0091\u0001\u0010kR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010v\u001a\u0005\b\u0093\u0001\u0010kR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010v\u001a\u0005\b\u0095\u0001\u0010kR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010v\u001a\u0005\b\u0097\u0001\u0010kR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\b\u0098\u0001\u0010v\u001a\u0004\b\u007f\u0010kR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010v\u001a\u0005\b\u009a\u0001\u0010kR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010v\u001a\u0005\b\u009c\u0001\u0010kR\u001d\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u009d\u0001\u001a\u0006\b\u009b\u0001\u0010\u009e\u0001R\u001b\u0010\"\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\bs\u0010\u009d\u0001\u001a\u0005\b}\u0010\u009e\u0001R\u001a\u0010#\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b|\u0010v\u001a\u0005\b\u009f\u0001\u0010kR\u001a\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\b~\u0010v\u001a\u0005\b\u0088\u0001\u0010kR\u001b\u0010%\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010v\u001a\u0005\b¡\u0001\u0010kR\u001b\u0010&\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010v\u001a\u0005\b£\u0001\u0010kR\u001b\u0010'\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010v\u001a\u0005\b¥\u0001\u0010kR\u001b\u0010(\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010v\u001a\u0005\b§\u0001\u0010kR\u001b\u0010)\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010v\u001a\u0005\b©\u0001\u0010kR\u001a\u0010*\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\bw\u0010v\u001a\u0005\bª\u0001\u0010kR\u001b\u0010+\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010v\u001a\u0005\b«\u0001\u0010kR\u001b\u0010,\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010v\u001a\u0005\b¬\u0001\u0010kR\u001b\u0010-\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010v\u001a\u0005\b\u00ad\u0001\u0010kR\u001b\u0010.\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010v\u001a\u0005\b¯\u0001\u0010kR\u001b\u0010/\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010v\u001a\u0005\b°\u0001\u0010kR\u001b\u00100\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010v\u001a\u0005\b±\u0001\u0010kR\u001b\u00101\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010v\u001a\u0005\b²\u0001\u0010kR\u001b\u00102\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010v\u001a\u0005\b®\u0001\u0010kR\u001b\u00103\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010v\u001a\u0005\b³\u0001\u0010kR\u001b\u00104\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010v\u001a\u0005\b´\u0001\u0010kR\u001b\u00105\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010v\u001a\u0005\bµ\u0001\u0010kR\u001d\u00106\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010\u008b\u0001\u001a\u0006\b \u0001\u0010\u008d\u0001R\u001d\u00107\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010\u008b\u0001\u001a\u0006\b¤\u0001\u0010\u008d\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010v\u001a\u0005\b¶\u0001\u0010kR\u001b\u00109\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010v\u001a\u0005\b·\u0001\u0010kR\u001b\u0010:\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010v\u001a\u0005\b¸\u0001\u0010kR\u001b\u0010;\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010v\u001a\u0005\b¹\u0001\u0010kR\u001b\u0010<\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010v\u001a\u0005\bº\u0001\u0010kR\u001b\u0010=\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010v\u001a\u0005\b»\u0001\u0010kR\u001b\u0010>\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010v\u001a\u0005\b¼\u0001\u0010kR\u001b\u0010?\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010v\u001a\u0005\b½\u0001\u0010kR\u001b\u0010@\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010v\u001a\u0005\b¿\u0001\u0010kR\u001b\u0010A\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010v\u001a\u0005\b¾\u0001\u0010kR\u001b\u0010B\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÁ\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010kR\u001b\u0010C\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010v\u001a\u0005\b\u008e\u0001\u0010kR\u001b\u0010D\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010v\u001a\u0005\b\u0083\u0001\u0010kR\u001b\u0010E\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÃ\u0001\u0010v\u001a\u0005\b\u0098\u0001\u0010kR\u001b\u0010F\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÄ\u0001\u0010v\u001a\u0005\b\u0096\u0001\u0010kR\u001b\u0010G\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b½\u0001\u0010v\u001a\u0005\b\u0090\u0001\u0010kR\u001b\u0010H\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010v\u001a\u0005\b\u008f\u0001\u0010kR\u001b\u0010I\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÆ\u0001\u0010v\u001a\u0005\b\u0094\u0001\u0010kR\u001b\u0010J\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÇ\u0001\u0010v\u001a\u0005\b\u0092\u0001\u0010kR\u001b\u0010K\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010v\u001a\u0005\b\u0087\u0001\u0010kR\u001b\u0010L\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÉ\u0001\u0010v\u001a\u0005\b\u0085\u0001\u0010kR\u001b\u0010M\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010v\u001a\u0005\b\u008a\u0001\u0010kR\u001b\u0010N\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010v\u001a\u0005\bÂ\u0001\u0010kR\u001b\u0010O\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010v\u001a\u0005\bÈ\u0001\u0010kR\u001b\u0010P\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010v\u001a\u0005\bÇ\u0001\u0010kR\u001b\u0010Q\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010v\u001a\u0005\bÄ\u0001\u0010kR\u001b\u0010R\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010v\u001a\u0005\bÃ\u0001\u0010kR\u001b\u0010S\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bº\u0001\u0010v\u001a\u0005\bÆ\u0001\u0010kR\u001b\u0010T\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010v\u001a\u0005\bÅ\u0001\u0010kR\u001b\u0010U\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010v\u001a\u0005\bÁ\u0001\u0010kR\u001b\u0010V\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010v\u001a\u0005\bÀ\u0001\u0010kR\u001f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00028\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010r\u001a\u0005\bÊ\u0001\u0010tR\u001b\u0010Y\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010v\u001a\u0005\bË\u0001\u0010kR\u001b\u0010Z\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010v\u001a\u0005\b\u0099\u0001\u0010kR\u001b\u0010[\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bË\u0001\u0010v\u001a\u0005\bÌ\u0001\u0010kR\u001b\u0010\\\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010v\u001a\u0005\bÍ\u0001\u0010kR\u001a\u0010]\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\bÌ\u0001\u0010v\u001a\u0004\bx\u0010kR\u001b\u0010^\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÍ\u0001\u0010v\u001a\u0005\bÉ\u0001\u0010kR\u001d\u0010_\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u008b\u0001\u001a\u0006\b¢\u0001\u0010\u008d\u0001R\u001c\u0010`\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bg\u0010\u008b\u0001\u001a\u0006\b¦\u0001\u0010\u008d\u0001R\u001d\u0010b\u001a\u0004\u0018\u00010a8\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010Î\u0001\u001a\u0006\b¨\u0001\u0010Ï\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/Store;", "", "", "Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;", "fulfillmentInfo", "", "mfcUnitId", "Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "auxUnitInfo", "Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;", "gasStationAmenities", "Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;", "gasStationHours", "Lcom/meijer/mobile/storeinfo/api/model/FuelPrices;", "fuelPrices", "storeFlag", "isMobileShoppingEnabled", "isMobilePaymentEnabled", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "milesFrom", PlaceTypes.ADDRESS, "city", "state", "zipCode", "unitType", "openDate", "closeDate", "phoneNumber", "name", "", "driveThru", "clinic", "pharmacyDailyOpen", "pharmacyDailyClose", "pharmacySatOpen", "pharmacySatClose", "pharmacySunOpen", "pharmacySunClose", "pharmacyHolidayOpen", "pharmacyHolidayClose", "pharmacyDriveThruWeekdayOpen", "pharmacyDriveThruWeekdayClose", "pharmacyDriveThruSatOpen", "pharmacyDriveThruSatClose", "pharmacyDriveThruSunOpen", "pharmacyDriveThruSunClose", "pharmacyTimezone", "pharmacyAddress", "pharmacyPhone", "storeDirName", "storeDirEmpId", "latitude", "longitude", "storeHours", "storeWeekDayOpen", "storeWeekDayClose", "storeSaturdayOpen", "storeSaturdayClose", "storeSundayOpen", "storeSundayClose", "preOrderServiceAllow", "preOrderPhone", "preOrderDriveThru", "curbsideAllow", "curbsidePhone", "curbsideDriveThru", "curbsideWeekdayOpen", "curbsideWeekdayClose", "curbsideSatOpen", "curbsideSatClose", "curbsideSunOpen", "curbsideSunClose", "curbsideHolidayOpen", "curbsideHolidayClose", "curbsideInStoreAllow", "preOrderInStoreAllow", "preOrderWeekdayOpen", "preOrderWeekdayClose", "preOrderSatOpen", "preOrderSatClose", "preOrderSunOpen", "preOrderSunClose", "preOrderHolidayOpen", "preOrderHolidayClose", "Lcom/meijer/mobile/storeinfo/api/model/Tenants;", "tenants", "timeZone", "daylightSavings", "vPos", "visibleDate", "cNCPickupDescription", "sPOPickupDescription", "latitudeRad", "longitudeRad", "Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;", "marketAndRegions", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;)V", "H0", "()Z", "E0", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;)Lcom/meijer/mobile/storeinfo/api/model/Store;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "v", "()Ljava/util/List;", "b", "Ljava/lang/String;", "D", "c", "Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "()Lcom/meijer/mobile/storeinfo/api/model/AuxUnitInfo;", "d", "w", "e", "x", "f", "u", "g", "p0", "h", "G0", "i", "F0", "j", "I", "r0", "k", "Ljava/lang/Double;", "E", "()Ljava/lang/Double;", "l", "m", "n", "m0", "o", "D0", "p", "A0", "q", "G", "r", "s", "Y", "t", "F", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "J", "y", "U", "z", "T", "A", "W", "B", "V", "C", "R", "Q", "P", "O", "L", "H", "K", "N", "M", "X", "S", "o0", "n0", "q0", "x0", "w0", "t0", "s0", "v0", "u0", "g0", "Z", "d0", "a0", "b0", "c0", "e0", "f0", "h0", "i0", "j0", "k0", "l0", "y0", "z0", "B0", "C0", "Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;", "()Lcom/meijer/mobile/storeinfo/api/model/MarketAndRegions;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Store {

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacySunOpen;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String visibleDate;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacySunClose;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cNCPickupDescription;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyHolidayOpen;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sPOPickupDescription;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyHolidayClose;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double latitudeRad;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruWeekdayOpen;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double longitudeRad;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruWeekdayClose;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata and from toString */
    private final MarketAndRegions marketAndRegions;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruSatOpen;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruSatClose;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruSunOpen;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDriveThruSunClose;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyTimezone;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyAddress;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyPhone;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirName;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirEmpId;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double latitude;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double longitude;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeHours;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeWeekDayOpen;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeWeekDayClose;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeSaturdayOpen;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeSaturdayClose;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeSundayOpen;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeSundayClose;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderServiceAllow;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderPhone;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentInfo> fulfillmentInfo;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderDriveThru;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mfcUnitId;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideAllow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuxUnitInfo auxUnitInfo;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsidePhone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<GasStationAmenities> gasStationAmenities;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideDriveThru;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<GasStationHours> gasStationHours;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideWeekdayOpen;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FuelPrices> fuelPrices;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideWeekdayClose;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFlag;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideSatOpen;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobileShoppingEnabled;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideSatClose;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobilePaymentEnabled;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideSunOpen;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideSunClose;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double milesFrom;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideHolidayOpen;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideHolidayClose;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideInStoreAllow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderInStoreAllow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderWeekdayOpen;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitType;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderWeekdayClose;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String openDate;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderSatOpen;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String closeDate;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderSatClose;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderSunOpen;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderSunClose;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean driveThru;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderHolidayOpen;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean clinic;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderHolidayClose;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDailyOpen;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Tenants> tenants;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyDailyClose;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeZone;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacySatOpen;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String daylightSavings;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacySatClose;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vPos;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/Store$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "Lok/h;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/Store;)Lok/h;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.storeinfo.api.model.Store$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StoreDetails a(Store store) {
            String str;
            LocalDateTime localDateTime;
            LocalDateTime localDateTime2;
            LocalDateTime localDateTime3;
            LocalDateTime localDateTime4;
            LocalDateTime localDateTime5;
            LocalDateTime localDateTime6;
            LocalDateTime localDateTime7;
            LocalDateTime localDateTime8;
            int i10;
            LocalDateTime localDateTime9;
            LocalDateTime localDateTime10;
            LocalDateTime localDateTime11;
            LocalDateTime localDateTime12;
            LocalDateTime localDateTime13;
            LocalDateTime localDateTime14;
            LocalDateTime localDateTime15;
            LocalDateTime localDateTime16;
            LocalDateTime localDateTime17;
            LocalDateTime localDateTime18;
            LocalDateTime localDateTime19;
            LocalDateTime localDateTime20;
            LocalDateTime localDateTime21;
            LocalDateTime localDateTime22;
            LocalDateTime localDateTime23;
            LocalDateTime localDateTime24;
            LocalDateTime localDateTime25;
            LocalDateTime localDateTime26;
            LocalDateTime localDateTime27;
            LocalDateTime localDateTime28;
            LocalDateTime localDateTime29;
            LocalDateTime localDateTime30;
            LocalDateTime localDateTime31;
            LocalDateTime localDateTime32;
            LocalDateTime localDateTime33;
            LocalDateTime localDateTime34;
            LocalDateTime localDateTime35;
            StoreAuxUnitInfo storeAuxUnitInfo;
            LocalDateTime localDateTime36;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            String str2;
            ArrayList arrayList7;
            LocalDateTime localDateTime37;
            LocalDateTime localDateTime38;
            LocalDateTime localDateTime39;
            LocalDateTime localDateTime40;
            LocalDateTime localDateTime41;
            LocalDateTime localDateTime42;
            LocalDateTime localDateTime43;
            LocalDateTime localDateTime44;
            LocalDateTime localDateTime45;
            LocalDateTime localDateTime46;
            LocalDateTime localDateTime47;
            LocalDateTime localDateTime48;
            LocalDateTime localDateTime49;
            LocalDateTime localDateTime50;
            ArrayList arrayList8;
            LocalDateTime localDateTime51;
            LocalDateTime localDateTime52;
            LocalDateTime localDateTime53;
            LocalDateTime localDateTime54;
            LocalDateTime localDateTime55;
            LocalDateTime localDateTime56;
            LocalDateTime localDateTime57;
            LocalDateTime localDateTime58;
            LocalDateTime localDateTime59;
            LocalDateTime localDateTime60;
            LocalDateTime localDateTime61;
            LocalDateTime localDateTime62;
            LocalDateTime localDateTime63;
            LocalDateTime localDateTime64;
            LocalDateTime localDateTime65;
            LocalDateTime localDateTime66;
            LocalDateTime localDateTime67;
            LocalDateTime localDateTime68;
            LocalDateTime localDateTime69;
            LocalDateTime localDateTime70;
            LocalDateTime localDateTime71;
            LocalDateTime localDateTime72;
            LocalDateTime localDateTime73;
            LocalDateTime localDateTime74;
            LocalDateTime localDateTime75;
            LocalDateTime localDateTime76;
            LocalDateTime localDateTime77;
            ArrayList arrayList9;
            ArrayList arrayList10;
            int i11;
            LocalDateTime localDateTime78;
            LocalDateTime localDateTime79;
            LocalDateTime localDateTime80;
            LocalDateTime localDateTime81;
            LocalDateTime localDateTime82;
            ArrayList arrayList11;
            String str3;
            LocalDateTime localDateTime83;
            LocalDateTime localDateTime84;
            LocalDateTime localDateTime85;
            LocalDateTime localDateTime86;
            LocalDateTime localDateTime87;
            LocalDateTime localDateTime88;
            LocalDateTime localDateTime89;
            LocalDateTime localDateTime90;
            LocalDateTime localDateTime91;
            Intrinsics.j(store, "<this>");
            int storeId = store.getStoreId();
            List<FulfillmentInfo> listV = store.v();
            ArrayList arrayList12 = new ArrayList(CollectionsKt.x(listV, 10));
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                arrayList12.add(FulfillmentInfo.INSTANCE.a((FulfillmentInfo) it.next()));
            }
            String mfcUnitId = store.getMfcUnitId();
            String address = store.getAddress();
            String city = store.getCity();
            String state = store.getState();
            String zipCode = store.getZipCode();
            Double latitude = store.getLatitude();
            Double longitude = store.getLongitude();
            String storeHours = store.getStoreHours();
            String storeWeekDayOpen = store.getStoreWeekDayOpen();
            LocalDateTime localDateTime92 = storeWeekDayOpen != null ? (LocalDateTime) d.b(storeWeekDayOpen, C17590a.f164803a.s(), new j()) : null;
            String storeWeekDayClose = store.getStoreWeekDayClose();
            LocalDateTime localDateTime93 = storeWeekDayClose != null ? (LocalDateTime) d.b(storeWeekDayClose, C17590a.f164803a.s(), new j()) : null;
            String storeSaturdayOpen = store.getStoreSaturdayOpen();
            LocalDateTime localDateTime94 = storeSaturdayOpen != null ? (LocalDateTime) d.b(storeSaturdayOpen, C17590a.f164803a.s(), new j()) : null;
            String storeSaturdayClose = store.getStoreSaturdayClose();
            if (storeSaturdayClose != null) {
                str = mfcUnitId;
                localDateTime = (LocalDateTime) d.b(storeSaturdayClose, C17590a.f164803a.s(), new j());
            } else {
                str = mfcUnitId;
                localDateTime = null;
            }
            String storeSundayOpen = store.getStoreSundayOpen();
            LocalDateTime localDateTime95 = storeSundayOpen != null ? (LocalDateTime) d.b(storeSundayOpen, C17590a.f164803a.s(), new j()) : null;
            String storeSundayClose = store.getStoreSundayClose();
            if (storeSundayClose != null) {
                localDateTime2 = localDateTime95;
                localDateTime3 = (LocalDateTime) d.b(storeSundayClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime2 = localDateTime95;
                localDateTime3 = null;
            }
            String openDate = store.getOpenDate();
            if (openDate != null) {
                localDateTime4 = localDateTime3;
                localDateTime5 = (LocalDateTime) d.b(openDate, C17590a.f164803a.s(), new j());
            } else {
                localDateTime4 = localDateTime3;
                localDateTime5 = null;
            }
            String closeDate = store.getCloseDate();
            if (closeDate != null) {
                localDateTime6 = localDateTime5;
                localDateTime7 = (LocalDateTime) d.b(closeDate, C17590a.f164803a.s(), new j());
            } else {
                localDateTime6 = localDateTime5;
                localDateTime7 = null;
            }
            LocalDateTime localDateTime96 = localDateTime4;
            Boolean driveThru = store.getDriveThru();
            String str4 = str;
            LocalDateTime localDateTime97 = localDateTime6;
            Boolean clinic = store.getClinic();
            String storeFlag = store.getStoreFlag();
            String isMobileShoppingEnabled = store.getIsMobileShoppingEnabled();
            String isMobilePaymentEnabled = store.getIsMobilePaymentEnabled();
            Double milesFrom = store.getMilesFrom();
            String name = store.getName();
            String phoneNumber = store.getPhoneNumber();
            String pharmacyPhone = store.getPharmacyPhone();
            LocalDateTime localDateTime98 = localDateTime7;
            String pharmacyDailyOpen = store.getPharmacyDailyOpen();
            if (pharmacyDailyOpen != null) {
                localDateTime8 = localDateTime96;
                i10 = storeId;
                localDateTime9 = (LocalDateTime) d.b(pharmacyDailyOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime8 = localDateTime96;
                i10 = storeId;
                localDateTime9 = null;
            }
            String pharmacyDailyClose = store.getPharmacyDailyClose();
            if (pharmacyDailyClose != null) {
                localDateTime10 = localDateTime9;
                localDateTime11 = (LocalDateTime) d.b(pharmacyDailyClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime10 = localDateTime9;
                localDateTime11 = null;
            }
            String pharmacySatOpen = store.getPharmacySatOpen();
            if (pharmacySatOpen != null) {
                localDateTime12 = localDateTime11;
                localDateTime13 = (LocalDateTime) d.b(pharmacySatOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime12 = localDateTime11;
                localDateTime13 = null;
            }
            String pharmacySatClose = store.getPharmacySatClose();
            if (pharmacySatClose != null) {
                localDateTime14 = localDateTime13;
                localDateTime15 = (LocalDateTime) d.b(pharmacySatClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime14 = localDateTime13;
                localDateTime15 = null;
            }
            String pharmacySunOpen = store.getPharmacySunOpen();
            if (pharmacySunOpen != null) {
                localDateTime16 = localDateTime15;
                localDateTime17 = (LocalDateTime) d.b(pharmacySunOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime16 = localDateTime15;
                localDateTime17 = null;
            }
            String pharmacySunClose = store.getPharmacySunClose();
            if (pharmacySunClose != null) {
                localDateTime18 = localDateTime17;
                localDateTime19 = (LocalDateTime) d.b(pharmacySunClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime18 = localDateTime17;
                localDateTime19 = null;
            }
            String pharmacyHolidayOpen = store.getPharmacyHolidayOpen();
            if (pharmacyHolidayOpen != null) {
                localDateTime20 = localDateTime19;
                localDateTime21 = (LocalDateTime) d.b(pharmacyHolidayOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime20 = localDateTime19;
                localDateTime21 = null;
            }
            String pharmacyHolidayClose = store.getPharmacyHolidayClose();
            if (pharmacyHolidayClose != null) {
                localDateTime22 = localDateTime21;
                localDateTime23 = (LocalDateTime) d.b(pharmacyHolidayClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime22 = localDateTime21;
                localDateTime23 = null;
            }
            String pharmacyDriveThruWeekdayOpen = store.getPharmacyDriveThruWeekdayOpen();
            if (pharmacyDriveThruWeekdayOpen != null) {
                localDateTime24 = localDateTime23;
                localDateTime25 = (LocalDateTime) d.b(pharmacyDriveThruWeekdayOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime24 = localDateTime23;
                localDateTime25 = null;
            }
            String pharmacyDriveThruWeekdayClose = store.getPharmacyDriveThruWeekdayClose();
            if (pharmacyDriveThruWeekdayClose != null) {
                localDateTime26 = localDateTime25;
                localDateTime27 = (LocalDateTime) d.b(pharmacyDriveThruWeekdayClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime26 = localDateTime25;
                localDateTime27 = null;
            }
            String pharmacyDriveThruSatOpen = store.getPharmacyDriveThruSatOpen();
            if (pharmacyDriveThruSatOpen != null) {
                localDateTime28 = localDateTime27;
                localDateTime29 = (LocalDateTime) d.b(pharmacyDriveThruSatOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime28 = localDateTime27;
                localDateTime29 = null;
            }
            String pharmacyDriveThruSatClose = store.getPharmacyDriveThruSatClose();
            if (pharmacyDriveThruSatClose != null) {
                localDateTime30 = localDateTime29;
                localDateTime31 = (LocalDateTime) d.b(pharmacyDriveThruSatClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime30 = localDateTime29;
                localDateTime31 = null;
            }
            String pharmacyDriveThruSunOpen = store.getPharmacyDriveThruSunOpen();
            if (pharmacyDriveThruSunOpen != null) {
                localDateTime32 = localDateTime31;
                localDateTime33 = (LocalDateTime) d.b(pharmacyDriveThruSunOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime32 = localDateTime31;
                localDateTime33 = null;
            }
            String pharmacyDriveThruSunClose = store.getPharmacyDriveThruSunClose();
            if (pharmacyDriveThruSunClose != null) {
                localDateTime34 = localDateTime33;
                localDateTime35 = (LocalDateTime) d.b(pharmacyDriveThruSunClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime34 = localDateTime33;
                localDateTime35 = null;
            }
            LocalDateTime localDateTime99 = localDateTime8;
            LocalDateTime localDateTime100 = localDateTime14;
            LocalDateTime localDateTime101 = localDateTime20;
            LocalDateTime localDateTime102 = localDateTime26;
            LocalDateTime localDateTime103 = localDateTime32;
            String pharmacyTimezone = store.getPharmacyTimezone();
            LocalDateTime localDateTime104 = localDateTime2;
            LocalDateTime localDateTime105 = localDateTime10;
            LocalDateTime localDateTime106 = localDateTime16;
            LocalDateTime localDateTime107 = localDateTime22;
            LocalDateTime localDateTime108 = localDateTime28;
            LocalDateTime localDateTime109 = localDateTime34;
            String pharmacyAddress = store.getPharmacyAddress();
            String unitType = store.getUnitType();
            AuxUnitInfo auxUnitInfo = store.getAuxUnitInfo();
            LocalDateTime localDateTime110 = localDateTime35;
            StoreAuxUnitInfo storeAuxUnitInfoA = auxUnitInfo != null ? AuxUnitInfo.INSTANCE.a(auxUnitInfo) : null;
            List<GasStationAmenities> listW = store.w();
            if (listW != null) {
                List<GasStationAmenities> list = listW;
                storeAuxUnitInfo = storeAuxUnitInfoA;
                localDateTime36 = localDateTime99;
                arrayList = arrayList12;
                arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(GasStationAmenities.INSTANCE.a((GasStationAmenities) it2.next()));
                }
            } else {
                storeAuxUnitInfo = storeAuxUnitInfoA;
                localDateTime36 = localDateTime99;
                arrayList = arrayList12;
                arrayList2 = null;
            }
            List<GasStationHours> listX = store.x();
            if (listX != null) {
                List<GasStationHours> list2 = listX;
                arrayList3 = arrayList2;
                arrayList4 = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(GasStationHours.INSTANCE.a((GasStationHours) it3.next()));
                }
            } else {
                arrayList3 = arrayList2;
                arrayList4 = null;
            }
            List<FuelPrices> listU = store.u();
            if (listU != null) {
                List<FuelPrices> list3 = listU;
                arrayList5 = arrayList4;
                arrayList6 = new ArrayList(CollectionsKt.x(list3, 10));
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(FuelPrices.INSTANCE.a((FuelPrices) it4.next()));
                }
            } else {
                arrayList5 = arrayList4;
                arrayList6 = null;
            }
            List<Tenants> listY0 = store.y0();
            ArrayList arrayList13 = new ArrayList(CollectionsKt.x(listY0, 10));
            for (Iterator it5 = listY0.iterator(); it5.hasNext(); it5 = it5) {
                arrayList13.add(Tenants.INSTANCE.a((Tenants) it5.next()));
            }
            String storeDirName = store.getStoreDirName();
            StoreAuxUnitInfo storeAuxUnitInfo2 = storeAuxUnitInfo;
            ArrayList arrayList14 = arrayList5;
            String storeDirEmpId = store.getStoreDirEmpId();
            String preOrderServiceAllow = store.getPreOrderServiceAllow();
            String preOrderPhone = store.getPreOrderPhone();
            String preOrderDriveThru = store.getPreOrderDriveThru();
            String curbsideAllow = store.getCurbsideAllow();
            String curbsidePhone = store.getCurbsidePhone();
            String curbsideDriveThru = store.getCurbsideDriveThru();
            String curbsideWeekdayOpen = store.getCurbsideWeekdayOpen();
            if (curbsideWeekdayOpen != null) {
                str2 = storeDirName;
                arrayList7 = arrayList6;
                localDateTime37 = (LocalDateTime) d.b(curbsideWeekdayOpen, C17590a.f164803a.s(), new j());
            } else {
                str2 = storeDirName;
                arrayList7 = arrayList6;
                localDateTime37 = null;
            }
            String curbsideWeekdayClose = store.getCurbsideWeekdayClose();
            if (curbsideWeekdayClose != null) {
                localDateTime38 = localDateTime37;
                localDateTime39 = (LocalDateTime) d.b(curbsideWeekdayClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime38 = localDateTime37;
                localDateTime39 = null;
            }
            String curbsideSatOpen = store.getCurbsideSatOpen();
            if (curbsideSatOpen != null) {
                localDateTime40 = localDateTime39;
                localDateTime41 = (LocalDateTime) d.b(curbsideSatOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime40 = localDateTime39;
                localDateTime41 = null;
            }
            String curbsideSatClose = store.getCurbsideSatClose();
            if (curbsideSatClose != null) {
                localDateTime42 = localDateTime41;
                localDateTime43 = (LocalDateTime) d.b(curbsideSatClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime42 = localDateTime41;
                localDateTime43 = null;
            }
            String curbsideSunOpen = store.getCurbsideSunOpen();
            if (curbsideSunOpen != null) {
                localDateTime44 = localDateTime43;
                localDateTime45 = (LocalDateTime) d.b(curbsideSunOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime44 = localDateTime43;
                localDateTime45 = null;
            }
            String curbsideSunClose = store.getCurbsideSunClose();
            if (curbsideSunClose != null) {
                localDateTime46 = localDateTime45;
                localDateTime47 = (LocalDateTime) d.b(curbsideSunClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime46 = localDateTime45;
                localDateTime47 = null;
            }
            String curbsideHolidayOpen = store.getCurbsideHolidayOpen();
            if (curbsideHolidayOpen != null) {
                localDateTime48 = localDateTime47;
                localDateTime49 = (LocalDateTime) d.b(curbsideHolidayOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime48 = localDateTime47;
                localDateTime49 = null;
            }
            String curbsideHolidayClose = store.getCurbsideHolidayClose();
            if (curbsideHolidayClose != null) {
                LocalDateTime localDateTime111 = localDateTime49;
                localDateTime55 = (LocalDateTime) d.b(curbsideHolidayClose, C17590a.f164803a.s(), new j());
                localDateTime50 = localDateTime36;
                arrayList8 = arrayList7;
                localDateTime51 = localDateTime38;
                localDateTime52 = localDateTime42;
                localDateTime53 = localDateTime46;
                localDateTime54 = localDateTime111;
            } else {
                localDateTime50 = localDateTime36;
                arrayList8 = arrayList7;
                localDateTime51 = localDateTime38;
                localDateTime52 = localDateTime42;
                localDateTime53 = localDateTime46;
                localDateTime54 = localDateTime49;
                localDateTime55 = null;
            }
            String curbsideInStoreAllow = store.getCurbsideInStoreAllow();
            String preOrderInStoreAllow = store.getPreOrderInStoreAllow();
            String preOrderWeekdayOpen = store.getPreOrderWeekdayOpen();
            if (preOrderWeekdayOpen != null) {
                localDateTime56 = localDateTime55;
                localDateTime57 = localDateTime50;
                localDateTime58 = (LocalDateTime) d.b(preOrderWeekdayOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime56 = localDateTime55;
                localDateTime57 = localDateTime50;
                localDateTime58 = null;
            }
            String preOrderWeekdayClose = store.getPreOrderWeekdayClose();
            if (preOrderWeekdayClose != null) {
                localDateTime59 = localDateTime58;
                localDateTime60 = (LocalDateTime) d.b(preOrderWeekdayClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime59 = localDateTime58;
                localDateTime60 = null;
            }
            String preOrderSatOpen = store.getPreOrderSatOpen();
            if (preOrderSatOpen != null) {
                localDateTime61 = localDateTime60;
                localDateTime62 = (LocalDateTime) d.b(preOrderSatOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime61 = localDateTime60;
                localDateTime62 = null;
            }
            String preOrderSatClose = store.getPreOrderSatClose();
            if (preOrderSatClose != null) {
                localDateTime63 = localDateTime62;
                localDateTime64 = (LocalDateTime) d.b(preOrderSatClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime63 = localDateTime62;
                localDateTime64 = null;
            }
            String preOrderSunOpen = store.getPreOrderSunOpen();
            if (preOrderSunOpen != null) {
                localDateTime65 = localDateTime64;
                localDateTime66 = (LocalDateTime) d.b(preOrderSunOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime65 = localDateTime64;
                localDateTime66 = null;
            }
            String preOrderSunClose = store.getPreOrderSunClose();
            if (preOrderSunClose != null) {
                localDateTime67 = localDateTime66;
                localDateTime68 = (LocalDateTime) d.b(preOrderSunClose, C17590a.f164803a.s(), new j());
            } else {
                localDateTime67 = localDateTime66;
                localDateTime68 = null;
            }
            String preOrderHolidayOpen = store.getPreOrderHolidayOpen();
            if (preOrderHolidayOpen != null) {
                localDateTime69 = localDateTime68;
                localDateTime70 = (LocalDateTime) d.b(preOrderHolidayOpen, C17590a.f164803a.s(), new j());
            } else {
                localDateTime69 = localDateTime68;
                localDateTime70 = null;
            }
            String preOrderHolidayClose = store.getPreOrderHolidayClose();
            if (preOrderHolidayClose != null) {
                LocalDateTime localDateTime112 = localDateTime70;
                localDateTime76 = (LocalDateTime) d.b(preOrderHolidayClose, C17590a.f164803a.s(), new j());
                localDateTime71 = localDateTime57;
                localDateTime72 = localDateTime59;
                localDateTime73 = localDateTime63;
                localDateTime74 = localDateTime67;
                localDateTime75 = localDateTime112;
            } else {
                localDateTime71 = localDateTime57;
                localDateTime72 = localDateTime59;
                localDateTime73 = localDateTime63;
                localDateTime74 = localDateTime67;
                localDateTime75 = localDateTime70;
                localDateTime76 = null;
            }
            String timeZone = store.getTimeZone();
            String daylightSavings = store.getDaylightSavings();
            String vPos = store.getVPos();
            String visibleDate = store.getVisibleDate();
            if (visibleDate != null) {
                LocalDateTime localDateTime113 = localDateTime76;
                localDateTime77 = localDateTime71;
                localDateTime91 = (LocalDateTime) d.b(visibleDate, C17590a.f164803a.s(), new j());
                arrayList9 = arrayList;
                arrayList10 = arrayList13;
                i11 = i10;
                localDateTime78 = localDateTime12;
                localDateTime79 = localDateTime18;
                localDateTime80 = localDateTime24;
                localDateTime81 = localDateTime30;
                localDateTime82 = localDateTime110;
                arrayList11 = arrayList3;
                str3 = str2;
                localDateTime83 = localDateTime40;
                localDateTime84 = localDateTime44;
                localDateTime85 = localDateTime48;
                localDateTime86 = localDateTime56;
                localDateTime87 = localDateTime61;
                localDateTime88 = localDateTime65;
                localDateTime89 = localDateTime69;
                localDateTime90 = localDateTime113;
            } else {
                localDateTime77 = localDateTime71;
                arrayList9 = arrayList;
                arrayList10 = arrayList13;
                i11 = i10;
                localDateTime78 = localDateTime12;
                localDateTime79 = localDateTime18;
                localDateTime80 = localDateTime24;
                localDateTime81 = localDateTime30;
                localDateTime82 = localDateTime110;
                arrayList11 = arrayList3;
                str3 = str2;
                localDateTime83 = localDateTime40;
                localDateTime84 = localDateTime44;
                localDateTime85 = localDateTime48;
                localDateTime86 = localDateTime56;
                localDateTime87 = localDateTime61;
                localDateTime88 = localDateTime65;
                localDateTime89 = localDateTime69;
                localDateTime90 = localDateTime76;
                localDateTime91 = null;
            }
            String cNCPickupDescription = store.getCNCPickupDescription();
            String sPOPickupDescription = store.getSPOPickupDescription();
            Double latitudeRad = store.getLatitudeRad();
            Double longitudeRad = store.getLongitudeRad();
            MarketAndRegions marketAndRegions = store.getMarketAndRegions();
            return new StoreDetails(i11, arrayList9, str4, address, city, state, zipCode, latitude, longitude, storeHours, localDateTime92, localDateTime93, localDateTime94, localDateTime, localDateTime104, localDateTime77, localDateTime97, localDateTime98, driveThru, clinic, storeFlag, isMobileShoppingEnabled, isMobilePaymentEnabled, milesFrom, name, phoneNumber, pharmacyPhone, localDateTime105, localDateTime78, localDateTime100, localDateTime106, localDateTime79, localDateTime101, localDateTime107, localDateTime80, localDateTime102, localDateTime108, localDateTime81, localDateTime103, localDateTime109, localDateTime82, pharmacyTimezone, pharmacyAddress, unitType, storeAuxUnitInfo2, arrayList11, arrayList14, arrayList8, arrayList10, str3, storeDirEmpId, preOrderServiceAllow, preOrderPhone, preOrderDriveThru, curbsideAllow, curbsidePhone, curbsideDriveThru, localDateTime51, localDateTime83, localDateTime52, localDateTime84, localDateTime53, localDateTime85, localDateTime54, localDateTime86, curbsideInStoreAllow, preOrderInStoreAllow, localDateTime72, localDateTime87, localDateTime73, localDateTime88, localDateTime74, localDateTime89, localDateTime75, localDateTime90, timeZone, daylightSavings, vPos, localDateTime91, cNCPickupDescription, sPOPickupDescription, latitudeRad, longitudeRad, marketAndRegions != null ? MarketAndRegions.INSTANCE.a(marketAndRegions) : null);
        }
    }

    public Store() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
    }

    public final Store copy(@g(name = "FulfillmentInfo") List<FulfillmentInfo> fulfillmentInfo, @g(name = "MfcUnitId") String mfcUnitId, @g(name = "AuxUnitInfo") AuxUnitInfo auxUnitInfo, @g(name = "GasStationAmenities") List<GasStationAmenities> gasStationAmenities, @g(name = "GasStationHours") List<GasStationHours> gasStationHours, @g(name = "FuelPrices") List<FuelPrices> fuelPrices, @g(name = "StoreFlag") String storeFlag, @g(name = "IsMobileShoppingEnabled") String isMobileShoppingEnabled, @g(name = "IsMobilePaymentEnabled") String isMobilePaymentEnabled, @g(name = "UnitId") int storeId, @g(name = "MilesFrom") Double milesFrom, @g(name = "Address") String address, @g(name = "City") String city, @g(name = "State") String state, @g(name = "Zip") String zipCode, @g(name = "UnitType") String unitType, @g(name = "OpenDate") String openDate, @g(name = "CloseDate") String closeDate, @g(name = "PhoneNumber") String phoneNumber, @g(name = "Name") String name, @g(name = "DriveThru") Boolean driveThru, @g(name = "Clinic") Boolean clinic, @g(name = "PharmDailyOpen") String pharmacyDailyOpen, @g(name = "PharmDailyClose") String pharmacyDailyClose, @g(name = "PharmSatOpen") String pharmacySatOpen, @g(name = "PharmSatClose") String pharmacySatClose, @g(name = "PharmSunOpen") String pharmacySunOpen, @g(name = "PharmSunClose") String pharmacySunClose, @g(name = "PharmHolidayOpen") String pharmacyHolidayOpen, @g(name = "PharmHolidayClose") String pharmacyHolidayClose, @g(name = "PharmDriveThruWeekdayOpen") String pharmacyDriveThruWeekdayOpen, @g(name = "PharmDriveThruWeekdayClose") String pharmacyDriveThruWeekdayClose, @g(name = "PharmDriveThruSatOpen") String pharmacyDriveThruSatOpen, @g(name = "PharmDriveThruSatClose") String pharmacyDriveThruSatClose, @g(name = "PharmDriveThruSunOpen") String pharmacyDriveThruSunOpen, @g(name = "PharmDriveThruSunClose") String pharmacyDriveThruSunClose, @g(name = "PharmTimezone") String pharmacyTimezone, @g(name = "PharmAddress") String pharmacyAddress, @g(name = "PharmPhone") String pharmacyPhone, @g(name = "StoreDirName") String storeDirName, @g(name = "StoreDirEmpId") String storeDirEmpId, @g(name = "Latitude") Double latitude, @g(name = "Longitude") Double longitude, @g(name = "StoreHours") String storeHours, @g(name = "StoreWeekdayOpen") String storeWeekDayOpen, @g(name = "StoreWeekdayClose") String storeWeekDayClose, @g(name = "StoreSatOpen") String storeSaturdayOpen, @g(name = "StoreSatClose") String storeSaturdayClose, @g(name = "StoreSunOpen") String storeSundayOpen, @g(name = "StoreSunClose") String storeSundayClose, @g(name = "PreOrderServiceAllow") String preOrderServiceAllow, @g(name = "PreOrderPhone") String preOrderPhone, @g(name = "PreOrderDriveThru") String preOrderDriveThru, @g(name = "CurbsideAllow") String curbsideAllow, @g(name = "CurbsidePhone") String curbsidePhone, @g(name = "CurbsideDriveThru") String curbsideDriveThru, @g(name = "CurbsideWeekdayOpen") String curbsideWeekdayOpen, @g(name = "CurbsideWeekdayClose") String curbsideWeekdayClose, @g(name = "CurbsideSatOpen") String curbsideSatOpen, @g(name = "CurbsideSatClose") String curbsideSatClose, @g(name = "CurbsideSunOpen") String curbsideSunOpen, @g(name = "CurbsideSunClose") String curbsideSunClose, @g(name = "CurbsideHolidayOpen") String curbsideHolidayOpen, @g(name = "CurbsideHolidayClose") String curbsideHolidayClose, @g(name = "CurbsideInstoreAllow") String curbsideInStoreAllow, @g(name = "PreOrderInstoreAllow") String preOrderInStoreAllow, @g(name = "PreOrderWeekdayOpen") String preOrderWeekdayOpen, @g(name = "PreOrderWeekdayClose") String preOrderWeekdayClose, @g(name = "PreOrderSatOpen") String preOrderSatOpen, @g(name = "PreOrderSatClose") String preOrderSatClose, @g(name = "PreOrderSunOpen") String preOrderSunOpen, @g(name = "PreOrderSunClose") String preOrderSunClose, @g(name = "PreOrderHolidayOpen") String preOrderHolidayOpen, @g(name = "PreOrderHolidayClose") String preOrderHolidayClose, @g(name = "Tenants") List<Tenants> tenants, @g(name = "TimeZone") String timeZone, @g(name = "DaylightSavings") String daylightSavings, @g(name = "Vpos") String vPos, @g(name = "VisibleDate") String visibleDate, @g(name = "CNCPickupDescription") String cNCPickupDescription, @g(name = "SPOPickupDescription") String sPOPickupDescription, @g(name = "Latitude_Rad") Double latitudeRad, @g(name = "Longitude_Rad") Double longitudeRad, @g(name = "MarketAndRegion") MarketAndRegions marketAndRegions) {
        Intrinsics.j(fulfillmentInfo, "fulfillmentInfo");
        Intrinsics.j(tenants, "tenants");
        return new Store(fulfillmentInfo, mfcUnitId, auxUnitInfo, gasStationAmenities, gasStationHours, fuelPrices, storeFlag, isMobileShoppingEnabled, isMobilePaymentEnabled, storeId, milesFrom, address, city, state, zipCode, unitType, openDate, closeDate, phoneNumber, name, driveThru, clinic, pharmacyDailyOpen, pharmacyDailyClose, pharmacySatOpen, pharmacySatClose, pharmacySunOpen, pharmacySunClose, pharmacyHolidayOpen, pharmacyHolidayClose, pharmacyDriveThruWeekdayOpen, pharmacyDriveThruWeekdayClose, pharmacyDriveThruSatOpen, pharmacyDriveThruSatClose, pharmacyDriveThruSunOpen, pharmacyDriveThruSunClose, pharmacyTimezone, pharmacyAddress, pharmacyPhone, storeDirName, storeDirEmpId, latitude, longitude, storeHours, storeWeekDayOpen, storeWeekDayClose, storeSaturdayOpen, storeSaturdayClose, storeSundayOpen, storeSundayClose, preOrderServiceAllow, preOrderPhone, preOrderDriveThru, curbsideAllow, curbsidePhone, curbsideDriveThru, curbsideWeekdayOpen, curbsideWeekdayClose, curbsideSatOpen, curbsideSatClose, curbsideSunOpen, curbsideSunClose, curbsideHolidayOpen, curbsideHolidayClose, curbsideInStoreAllow, preOrderInStoreAllow, preOrderWeekdayOpen, preOrderWeekdayClose, preOrderSatOpen, preOrderSatClose, preOrderSunOpen, preOrderSunClose, preOrderHolidayOpen, preOrderHolidayClose, tenants, timeZone, daylightSavings, vPos, visibleDate, cNCPickupDescription, sPOPickupDescription, latitudeRad, longitudeRad, marketAndRegions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Store)) {
            return false;
        }
        Store store = (Store) other;
        return Intrinsics.e(this.fulfillmentInfo, store.fulfillmentInfo) && Intrinsics.e(this.mfcUnitId, store.mfcUnitId) && Intrinsics.e(this.auxUnitInfo, store.auxUnitInfo) && Intrinsics.e(this.gasStationAmenities, store.gasStationAmenities) && Intrinsics.e(this.gasStationHours, store.gasStationHours) && Intrinsics.e(this.fuelPrices, store.fuelPrices) && Intrinsics.e(this.storeFlag, store.storeFlag) && Intrinsics.e(this.isMobileShoppingEnabled, store.isMobileShoppingEnabled) && Intrinsics.e(this.isMobilePaymentEnabled, store.isMobilePaymentEnabled) && this.storeId == store.storeId && Intrinsics.e(this.milesFrom, store.milesFrom) && Intrinsics.e(this.address, store.address) && Intrinsics.e(this.city, store.city) && Intrinsics.e(this.state, store.state) && Intrinsics.e(this.zipCode, store.zipCode) && Intrinsics.e(this.unitType, store.unitType) && Intrinsics.e(this.openDate, store.openDate) && Intrinsics.e(this.closeDate, store.closeDate) && Intrinsics.e(this.phoneNumber, store.phoneNumber) && Intrinsics.e(this.name, store.name) && Intrinsics.e(this.driveThru, store.driveThru) && Intrinsics.e(this.clinic, store.clinic) && Intrinsics.e(this.pharmacyDailyOpen, store.pharmacyDailyOpen) && Intrinsics.e(this.pharmacyDailyClose, store.pharmacyDailyClose) && Intrinsics.e(this.pharmacySatOpen, store.pharmacySatOpen) && Intrinsics.e(this.pharmacySatClose, store.pharmacySatClose) && Intrinsics.e(this.pharmacySunOpen, store.pharmacySunOpen) && Intrinsics.e(this.pharmacySunClose, store.pharmacySunClose) && Intrinsics.e(this.pharmacyHolidayOpen, store.pharmacyHolidayOpen) && Intrinsics.e(this.pharmacyHolidayClose, store.pharmacyHolidayClose) && Intrinsics.e(this.pharmacyDriveThruWeekdayOpen, store.pharmacyDriveThruWeekdayOpen) && Intrinsics.e(this.pharmacyDriveThruWeekdayClose, store.pharmacyDriveThruWeekdayClose) && Intrinsics.e(this.pharmacyDriveThruSatOpen, store.pharmacyDriveThruSatOpen) && Intrinsics.e(this.pharmacyDriveThruSatClose, store.pharmacyDriveThruSatClose) && Intrinsics.e(this.pharmacyDriveThruSunOpen, store.pharmacyDriveThruSunOpen) && Intrinsics.e(this.pharmacyDriveThruSunClose, store.pharmacyDriveThruSunClose) && Intrinsics.e(this.pharmacyTimezone, store.pharmacyTimezone) && Intrinsics.e(this.pharmacyAddress, store.pharmacyAddress) && Intrinsics.e(this.pharmacyPhone, store.pharmacyPhone) && Intrinsics.e(this.storeDirName, store.storeDirName) && Intrinsics.e(this.storeDirEmpId, store.storeDirEmpId) && Intrinsics.e(this.latitude, store.latitude) && Intrinsics.e(this.longitude, store.longitude) && Intrinsics.e(this.storeHours, store.storeHours) && Intrinsics.e(this.storeWeekDayOpen, store.storeWeekDayOpen) && Intrinsics.e(this.storeWeekDayClose, store.storeWeekDayClose) && Intrinsics.e(this.storeSaturdayOpen, store.storeSaturdayOpen) && Intrinsics.e(this.storeSaturdayClose, store.storeSaturdayClose) && Intrinsics.e(this.storeSundayOpen, store.storeSundayOpen) && Intrinsics.e(this.storeSundayClose, store.storeSundayClose) && Intrinsics.e(this.preOrderServiceAllow, store.preOrderServiceAllow) && Intrinsics.e(this.preOrderPhone, store.preOrderPhone) && Intrinsics.e(this.preOrderDriveThru, store.preOrderDriveThru) && Intrinsics.e(this.curbsideAllow, store.curbsideAllow) && Intrinsics.e(this.curbsidePhone, store.curbsidePhone) && Intrinsics.e(this.curbsideDriveThru, store.curbsideDriveThru) && Intrinsics.e(this.curbsideWeekdayOpen, store.curbsideWeekdayOpen) && Intrinsics.e(this.curbsideWeekdayClose, store.curbsideWeekdayClose) && Intrinsics.e(this.curbsideSatOpen, store.curbsideSatOpen) && Intrinsics.e(this.curbsideSatClose, store.curbsideSatClose) && Intrinsics.e(this.curbsideSunOpen, store.curbsideSunOpen) && Intrinsics.e(this.curbsideSunClose, store.curbsideSunClose) && Intrinsics.e(this.curbsideHolidayOpen, store.curbsideHolidayOpen) && Intrinsics.e(this.curbsideHolidayClose, store.curbsideHolidayClose) && Intrinsics.e(this.curbsideInStoreAllow, store.curbsideInStoreAllow) && Intrinsics.e(this.preOrderInStoreAllow, store.preOrderInStoreAllow) && Intrinsics.e(this.preOrderWeekdayOpen, store.preOrderWeekdayOpen) && Intrinsics.e(this.preOrderWeekdayClose, store.preOrderWeekdayClose) && Intrinsics.e(this.preOrderSatOpen, store.preOrderSatOpen) && Intrinsics.e(this.preOrderSatClose, store.preOrderSatClose) && Intrinsics.e(this.preOrderSunOpen, store.preOrderSunOpen) && Intrinsics.e(this.preOrderSunClose, store.preOrderSunClose) && Intrinsics.e(this.preOrderHolidayOpen, store.preOrderHolidayOpen) && Intrinsics.e(this.preOrderHolidayClose, store.preOrderHolidayClose) && Intrinsics.e(this.tenants, store.tenants) && Intrinsics.e(this.timeZone, store.timeZone) && Intrinsics.e(this.daylightSavings, store.daylightSavings) && Intrinsics.e(this.vPos, store.vPos) && Intrinsics.e(this.visibleDate, store.visibleDate) && Intrinsics.e(this.cNCPickupDescription, store.cNCPickupDescription) && Intrinsics.e(this.sPOPickupDescription, store.sPOPickupDescription) && Intrinsics.e(this.latitudeRad, store.latitudeRad) && Intrinsics.e(this.longitudeRad, store.longitudeRad) && Intrinsics.e(this.marketAndRegions, store.marketAndRegions);
    }

    public int hashCode() {
        int iHashCode = this.fulfillmentInfo.hashCode() * 31;
        String str = this.mfcUnitId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AuxUnitInfo auxUnitInfo = this.auxUnitInfo;
        int iHashCode3 = (iHashCode2 + (auxUnitInfo == null ? 0 : auxUnitInfo.hashCode())) * 31;
        List<GasStationAmenities> list = this.gasStationAmenities;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GasStationHours> list2 = this.gasStationHours;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FuelPrices> list3 = this.fuelPrices;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.storeFlag;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isMobileShoppingEnabled;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isMobilePaymentEnabled;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        Double d10 = this.milesFrom;
        int iHashCode10 = (iHashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str5 = this.address;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zipCode;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.unitType;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.openDate;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.closeDate;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phoneNumber;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.name;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.driveThru;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.clinic;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.pharmacyDailyOpen;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.pharmacyDailyClose;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.pharmacySatOpen;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.pharmacySatClose;
        int iHashCode25 = (iHashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.pharmacySunOpen;
        int iHashCode26 = (iHashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.pharmacySunClose;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pharmacyHolidayOpen;
        int iHashCode28 = (iHashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.pharmacyHolidayClose;
        int iHashCode29 = (iHashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.pharmacyDriveThruWeekdayOpen;
        int iHashCode30 = (iHashCode29 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.pharmacyDriveThruWeekdayClose;
        int iHashCode31 = (iHashCode30 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.pharmacyDriveThruSatOpen;
        int iHashCode32 = (iHashCode31 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.pharmacyDriveThruSatClose;
        int iHashCode33 = (iHashCode32 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.pharmacyDriveThruSunOpen;
        int iHashCode34 = (iHashCode33 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.pharmacyDriveThruSunClose;
        int iHashCode35 = (iHashCode34 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.pharmacyTimezone;
        int iHashCode36 = (iHashCode35 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.pharmacyAddress;
        int iHashCode37 = (iHashCode36 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.pharmacyPhone;
        int iHashCode38 = (iHashCode37 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.storeDirName;
        int iHashCode39 = (iHashCode38 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.storeDirEmpId;
        int iHashCode40 = (iHashCode39 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Double d11 = this.latitude;
        int iHashCode41 = (iHashCode40 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.longitude;
        int iHashCode42 = (iHashCode41 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str33 = this.storeHours;
        int iHashCode43 = (iHashCode42 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.storeWeekDayOpen;
        int iHashCode44 = (iHashCode43 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.storeWeekDayClose;
        int iHashCode45 = (iHashCode44 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.storeSaturdayOpen;
        int iHashCode46 = (iHashCode45 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.storeSaturdayClose;
        int iHashCode47 = (iHashCode46 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.storeSundayOpen;
        int iHashCode48 = (iHashCode47 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.storeSundayClose;
        int iHashCode49 = (iHashCode48 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.preOrderServiceAllow;
        int iHashCode50 = (iHashCode49 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.preOrderPhone;
        int iHashCode51 = (iHashCode50 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.preOrderDriveThru;
        int iHashCode52 = (iHashCode51 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.curbsideAllow;
        int iHashCode53 = (iHashCode52 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.curbsidePhone;
        int iHashCode54 = (iHashCode53 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.curbsideDriveThru;
        int iHashCode55 = (iHashCode54 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.curbsideWeekdayOpen;
        int iHashCode56 = (iHashCode55 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.curbsideWeekdayClose;
        int iHashCode57 = (iHashCode56 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.curbsideSatOpen;
        int iHashCode58 = (iHashCode57 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.curbsideSatClose;
        int iHashCode59 = (iHashCode58 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.curbsideSunOpen;
        int iHashCode60 = (iHashCode59 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.curbsideSunClose;
        int iHashCode61 = (iHashCode60 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.curbsideHolidayOpen;
        int iHashCode62 = (iHashCode61 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.curbsideHolidayClose;
        int iHashCode63 = (iHashCode62 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.curbsideInStoreAllow;
        int iHashCode64 = (iHashCode63 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.preOrderInStoreAllow;
        int iHashCode65 = (iHashCode64 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.preOrderWeekdayOpen;
        int iHashCode66 = (iHashCode65 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.preOrderWeekdayClose;
        int iHashCode67 = (iHashCode66 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.preOrderSatOpen;
        int iHashCode68 = (iHashCode67 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.preOrderSatClose;
        int iHashCode69 = (iHashCode68 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.preOrderSunOpen;
        int iHashCode70 = (iHashCode69 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.preOrderSunClose;
        int iHashCode71 = (iHashCode70 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.preOrderHolidayOpen;
        int iHashCode72 = (iHashCode71 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.preOrderHolidayClose;
        int iHashCode73 = (((iHashCode72 + (str63 == null ? 0 : str63.hashCode())) * 31) + this.tenants.hashCode()) * 31;
        String str64 = this.timeZone;
        int iHashCode74 = (iHashCode73 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.daylightSavings;
        int iHashCode75 = (iHashCode74 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.vPos;
        int iHashCode76 = (iHashCode75 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.visibleDate;
        int iHashCode77 = (iHashCode76 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.cNCPickupDescription;
        int iHashCode78 = (iHashCode77 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.sPOPickupDescription;
        int iHashCode79 = (iHashCode78 + (str69 == null ? 0 : str69.hashCode())) * 31;
        Double d13 = this.latitudeRad;
        int iHashCode80 = (iHashCode79 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.longitudeRad;
        int iHashCode81 = (iHashCode80 + (d14 == null ? 0 : d14.hashCode())) * 31;
        MarketAndRegions marketAndRegions = this.marketAndRegions;
        return iHashCode81 + (marketAndRegions != null ? marketAndRegions.hashCode() : 0);
    }

    public String toString() {
        return "Store(fulfillmentInfo=" + this.fulfillmentInfo + ", mfcUnitId=" + this.mfcUnitId + ", auxUnitInfo=" + this.auxUnitInfo + ", gasStationAmenities=" + this.gasStationAmenities + ", gasStationHours=" + this.gasStationHours + ", fuelPrices=" + this.fuelPrices + ", storeFlag=" + this.storeFlag + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", isMobilePaymentEnabled=" + this.isMobilePaymentEnabled + ", storeId=" + this.storeId + ", milesFrom=" + this.milesFrom + ", address=" + this.address + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", unitType=" + this.unitType + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", phoneNumber=" + this.phoneNumber + ", name=" + this.name + ", driveThru=" + this.driveThru + ", clinic=" + this.clinic + ", pharmacyDailyOpen=" + this.pharmacyDailyOpen + ", pharmacyDailyClose=" + this.pharmacyDailyClose + ", pharmacySatOpen=" + this.pharmacySatOpen + ", pharmacySatClose=" + this.pharmacySatClose + ", pharmacySunOpen=" + this.pharmacySunOpen + ", pharmacySunClose=" + this.pharmacySunClose + ", pharmacyHolidayOpen=" + this.pharmacyHolidayOpen + ", pharmacyHolidayClose=" + this.pharmacyHolidayClose + ", pharmacyDriveThruWeekdayOpen=" + this.pharmacyDriveThruWeekdayOpen + ", pharmacyDriveThruWeekdayClose=" + this.pharmacyDriveThruWeekdayClose + ", pharmacyDriveThruSatOpen=" + this.pharmacyDriveThruSatOpen + ", pharmacyDriveThruSatClose=" + this.pharmacyDriveThruSatClose + ", pharmacyDriveThruSunOpen=" + this.pharmacyDriveThruSunOpen + ", pharmacyDriveThruSunClose=" + this.pharmacyDriveThruSunClose + ", pharmacyTimezone=" + this.pharmacyTimezone + ", pharmacyAddress=" + this.pharmacyAddress + ", pharmacyPhone=" + this.pharmacyPhone + ", storeDirName=" + this.storeDirName + ", storeDirEmpId=" + this.storeDirEmpId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", storeHours=" + this.storeHours + ", storeWeekDayOpen=" + this.storeWeekDayOpen + ", storeWeekDayClose=" + this.storeWeekDayClose + ", storeSaturdayOpen=" + this.storeSaturdayOpen + ", storeSaturdayClose=" + this.storeSaturdayClose + ", storeSundayOpen=" + this.storeSundayOpen + ", storeSundayClose=" + this.storeSundayClose + ", preOrderServiceAllow=" + this.preOrderServiceAllow + ", preOrderPhone=" + this.preOrderPhone + ", preOrderDriveThru=" + this.preOrderDriveThru + ", curbsideAllow=" + this.curbsideAllow + ", curbsidePhone=" + this.curbsidePhone + ", curbsideDriveThru=" + this.curbsideDriveThru + ", curbsideWeekdayOpen=" + this.curbsideWeekdayOpen + ", curbsideWeekdayClose=" + this.curbsideWeekdayClose + ", curbsideSatOpen=" + this.curbsideSatOpen + ", curbsideSatClose=" + this.curbsideSatClose + ", curbsideSunOpen=" + this.curbsideSunOpen + ", curbsideSunClose=" + this.curbsideSunClose + ", curbsideHolidayOpen=" + this.curbsideHolidayOpen + ", curbsideHolidayClose=" + this.curbsideHolidayClose + ", curbsideInStoreAllow=" + this.curbsideInStoreAllow + ", preOrderInStoreAllow=" + this.preOrderInStoreAllow + ", preOrderWeekdayOpen=" + this.preOrderWeekdayOpen + ", preOrderWeekdayClose=" + this.preOrderWeekdayClose + ", preOrderSatOpen=" + this.preOrderSatOpen + ", preOrderSatClose=" + this.preOrderSatClose + ", preOrderSunOpen=" + this.preOrderSunOpen + ", preOrderSunClose=" + this.preOrderSunClose + ", preOrderHolidayOpen=" + this.preOrderHolidayOpen + ", preOrderHolidayClose=" + this.preOrderHolidayClose + ", tenants=" + this.tenants + ", timeZone=" + this.timeZone + ", daylightSavings=" + this.daylightSavings + ", vPos=" + this.vPos + ", visibleDate=" + this.visibleDate + ", cNCPickupDescription=" + this.cNCPickupDescription + ", sPOPickupDescription=" + this.sPOPickupDescription + ", latitudeRad=" + this.latitudeRad + ", longitudeRad=" + this.longitudeRad + ", marketAndRegions=" + this.marketAndRegions + ')';
    }

    public Store(@g(name = "FulfillmentInfo") List<FulfillmentInfo> fulfillmentInfo, @g(name = "MfcUnitId") String str, @g(name = "AuxUnitInfo") AuxUnitInfo auxUnitInfo, @g(name = "GasStationAmenities") List<GasStationAmenities> list, @g(name = "GasStationHours") List<GasStationHours> list2, @g(name = "FuelPrices") List<FuelPrices> list3, @g(name = "StoreFlag") String str2, @g(name = "IsMobileShoppingEnabled") String str3, @g(name = "IsMobilePaymentEnabled") String str4, @g(name = "UnitId") int i10, @g(name = "MilesFrom") Double d10, @g(name = "Address") String str5, @g(name = "City") String str6, @g(name = "State") String str7, @g(name = "Zip") String str8, @g(name = "UnitType") String str9, @g(name = "OpenDate") String str10, @g(name = "CloseDate") String str11, @g(name = "PhoneNumber") String str12, @g(name = "Name") String str13, @g(name = "DriveThru") Boolean bool, @g(name = "Clinic") Boolean bool2, @g(name = "PharmDailyOpen") String str14, @g(name = "PharmDailyClose") String str15, @g(name = "PharmSatOpen") String str16, @g(name = "PharmSatClose") String str17, @g(name = "PharmSunOpen") String str18, @g(name = "PharmSunClose") String str19, @g(name = "PharmHolidayOpen") String str20, @g(name = "PharmHolidayClose") String str21, @g(name = "PharmDriveThruWeekdayOpen") String str22, @g(name = "PharmDriveThruWeekdayClose") String str23, @g(name = "PharmDriveThruSatOpen") String str24, @g(name = "PharmDriveThruSatClose") String str25, @g(name = "PharmDriveThruSunOpen") String str26, @g(name = "PharmDriveThruSunClose") String str27, @g(name = "PharmTimezone") String str28, @g(name = "PharmAddress") String str29, @g(name = "PharmPhone") String str30, @g(name = "StoreDirName") String str31, @g(name = "StoreDirEmpId") String str32, @g(name = "Latitude") Double d11, @g(name = "Longitude") Double d12, @g(name = "StoreHours") String str33, @g(name = "StoreWeekdayOpen") String str34, @g(name = "StoreWeekdayClose") String str35, @g(name = "StoreSatOpen") String str36, @g(name = "StoreSatClose") String str37, @g(name = "StoreSunOpen") String str38, @g(name = "StoreSunClose") String str39, @g(name = "PreOrderServiceAllow") String str40, @g(name = "PreOrderPhone") String str41, @g(name = "PreOrderDriveThru") String str42, @g(name = "CurbsideAllow") String str43, @g(name = "CurbsidePhone") String str44, @g(name = "CurbsideDriveThru") String str45, @g(name = "CurbsideWeekdayOpen") String str46, @g(name = "CurbsideWeekdayClose") String str47, @g(name = "CurbsideSatOpen") String str48, @g(name = "CurbsideSatClose") String str49, @g(name = "CurbsideSunOpen") String str50, @g(name = "CurbsideSunClose") String str51, @g(name = "CurbsideHolidayOpen") String str52, @g(name = "CurbsideHolidayClose") String str53, @g(name = "CurbsideInstoreAllow") String str54, @g(name = "PreOrderInstoreAllow") String str55, @g(name = "PreOrderWeekdayOpen") String str56, @g(name = "PreOrderWeekdayClose") String str57, @g(name = "PreOrderSatOpen") String str58, @g(name = "PreOrderSatClose") String str59, @g(name = "PreOrderSunOpen") String str60, @g(name = "PreOrderSunClose") String str61, @g(name = "PreOrderHolidayOpen") String str62, @g(name = "PreOrderHolidayClose") String str63, @g(name = "Tenants") List<Tenants> tenants, @g(name = "TimeZone") String str64, @g(name = "DaylightSavings") String str65, @g(name = "Vpos") String str66, @g(name = "VisibleDate") String str67, @g(name = "CNCPickupDescription") String str68, @g(name = "SPOPickupDescription") String str69, @g(name = "Latitude_Rad") Double d13, @g(name = "Longitude_Rad") Double d14, @g(name = "MarketAndRegion") MarketAndRegions marketAndRegions) {
        Intrinsics.j(fulfillmentInfo, "fulfillmentInfo");
        Intrinsics.j(tenants, "tenants");
        this.fulfillmentInfo = fulfillmentInfo;
        this.mfcUnitId = str;
        this.auxUnitInfo = auxUnitInfo;
        this.gasStationAmenities = list;
        this.gasStationHours = list2;
        this.fuelPrices = list3;
        this.storeFlag = str2;
        this.isMobileShoppingEnabled = str3;
        this.isMobilePaymentEnabled = str4;
        this.storeId = i10;
        this.milesFrom = d10;
        this.address = str5;
        this.city = str6;
        this.state = str7;
        this.zipCode = str8;
        this.unitType = str9;
        this.openDate = str10;
        this.closeDate = str11;
        this.phoneNumber = str12;
        this.name = str13;
        this.driveThru = bool;
        this.clinic = bool2;
        this.pharmacyDailyOpen = str14;
        this.pharmacyDailyClose = str15;
        this.pharmacySatOpen = str16;
        this.pharmacySatClose = str17;
        this.pharmacySunOpen = str18;
        this.pharmacySunClose = str19;
        this.pharmacyHolidayOpen = str20;
        this.pharmacyHolidayClose = str21;
        this.pharmacyDriveThruWeekdayOpen = str22;
        this.pharmacyDriveThruWeekdayClose = str23;
        this.pharmacyDriveThruSatOpen = str24;
        this.pharmacyDriveThruSatClose = str25;
        this.pharmacyDriveThruSunOpen = str26;
        this.pharmacyDriveThruSunClose = str27;
        this.pharmacyTimezone = str28;
        this.pharmacyAddress = str29;
        this.pharmacyPhone = str30;
        this.storeDirName = str31;
        this.storeDirEmpId = str32;
        this.latitude = d11;
        this.longitude = d12;
        this.storeHours = str33;
        this.storeWeekDayOpen = str34;
        this.storeWeekDayClose = str35;
        this.storeSaturdayOpen = str36;
        this.storeSaturdayClose = str37;
        this.storeSundayOpen = str38;
        this.storeSundayClose = str39;
        this.preOrderServiceAllow = str40;
        this.preOrderPhone = str41;
        this.preOrderDriveThru = str42;
        this.curbsideAllow = str43;
        this.curbsidePhone = str44;
        this.curbsideDriveThru = str45;
        this.curbsideWeekdayOpen = str46;
        this.curbsideWeekdayClose = str47;
        this.curbsideSatOpen = str48;
        this.curbsideSatClose = str49;
        this.curbsideSunOpen = str50;
        this.curbsideSunClose = str51;
        this.curbsideHolidayOpen = str52;
        this.curbsideHolidayClose = str53;
        this.curbsideInStoreAllow = str54;
        this.preOrderInStoreAllow = str55;
        this.preOrderWeekdayOpen = str56;
        this.preOrderWeekdayClose = str57;
        this.preOrderSatOpen = str58;
        this.preOrderSatClose = str59;
        this.preOrderSunOpen = str60;
        this.preOrderSunClose = str61;
        this.preOrderHolidayOpen = str62;
        this.preOrderHolidayClose = str63;
        this.tenants = tenants;
        this.timeZone = str64;
        this.daylightSavings = str65;
        this.vPos = str66;
        this.visibleDate = str67;
        this.cNCPickupDescription = str68;
        this.sPOPickupDescription = str69;
        this.latitudeRad = d13;
        this.longitudeRad = d14;
        this.marketAndRegions = marketAndRegions;
    }

    /* renamed from: A, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: A0, reason: from getter */
    public final String getUnitType() {
        return this.unitType;
    }

    /* renamed from: B, reason: from getter */
    public final Double getLongitudeRad() {
        return this.longitudeRad;
    }

    /* renamed from: B0, reason: from getter */
    public final String getVPos() {
        return this.vPos;
    }

    /* renamed from: C, reason: from getter */
    public final MarketAndRegions getMarketAndRegions() {
        return this.marketAndRegions;
    }

    /* renamed from: C0, reason: from getter */
    public final String getVisibleDate() {
        return this.visibleDate;
    }

    /* renamed from: D, reason: from getter */
    public final String getMfcUnitId() {
        return this.mfcUnitId;
    }

    /* renamed from: D0, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: E, reason: from getter */
    public final Double getMilesFrom() {
        return this.milesFrom;
    }

    public final boolean E0() {
        return StringsKt.H("CS", this.unitType, true);
    }

    /* renamed from: F, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: F0, reason: from getter */
    public final String getIsMobilePaymentEnabled() {
        return this.isMobilePaymentEnabled;
    }

    /* renamed from: G, reason: from getter */
    public final String getOpenDate() {
        return this.openDate;
    }

    /* renamed from: G0, reason: from getter */
    public final String getIsMobileShoppingEnabled() {
        return this.isMobileShoppingEnabled;
    }

    /* renamed from: H, reason: from getter */
    public final String getPharmacyAddress() {
        return this.pharmacyAddress;
    }

    public final boolean H0() {
        return StringsKt.H("MS", this.unitType, true);
    }

    /* renamed from: I, reason: from getter */
    public final String getPharmacyDailyClose() {
        return this.pharmacyDailyClose;
    }

    /* renamed from: J, reason: from getter */
    public final String getPharmacyDailyOpen() {
        return this.pharmacyDailyOpen;
    }

    /* renamed from: K, reason: from getter */
    public final String getPharmacyDriveThruSatClose() {
        return this.pharmacyDriveThruSatClose;
    }

    /* renamed from: L, reason: from getter */
    public final String getPharmacyDriveThruSatOpen() {
        return this.pharmacyDriveThruSatOpen;
    }

    /* renamed from: M, reason: from getter */
    public final String getPharmacyDriveThruSunClose() {
        return this.pharmacyDriveThruSunClose;
    }

    /* renamed from: N, reason: from getter */
    public final String getPharmacyDriveThruSunOpen() {
        return this.pharmacyDriveThruSunOpen;
    }

    /* renamed from: O, reason: from getter */
    public final String getPharmacyDriveThruWeekdayClose() {
        return this.pharmacyDriveThruWeekdayClose;
    }

    /* renamed from: P, reason: from getter */
    public final String getPharmacyDriveThruWeekdayOpen() {
        return this.pharmacyDriveThruWeekdayOpen;
    }

    /* renamed from: Q, reason: from getter */
    public final String getPharmacyHolidayClose() {
        return this.pharmacyHolidayClose;
    }

    /* renamed from: R, reason: from getter */
    public final String getPharmacyHolidayOpen() {
        return this.pharmacyHolidayOpen;
    }

    /* renamed from: S, reason: from getter */
    public final String getPharmacyPhone() {
        return this.pharmacyPhone;
    }

    /* renamed from: T, reason: from getter */
    public final String getPharmacySatClose() {
        return this.pharmacySatClose;
    }

    /* renamed from: U, reason: from getter */
    public final String getPharmacySatOpen() {
        return this.pharmacySatOpen;
    }

    /* renamed from: V, reason: from getter */
    public final String getPharmacySunClose() {
        return this.pharmacySunClose;
    }

    /* renamed from: W, reason: from getter */
    public final String getPharmacySunOpen() {
        return this.pharmacySunOpen;
    }

    /* renamed from: X, reason: from getter */
    public final String getPharmacyTimezone() {
        return this.pharmacyTimezone;
    }

    /* renamed from: Y, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: Z, reason: from getter */
    public final String getPreOrderDriveThru() {
        return this.preOrderDriveThru;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: a0, reason: from getter */
    public final String getPreOrderHolidayClose() {
        return this.preOrderHolidayClose;
    }

    /* renamed from: b, reason: from getter */
    public final AuxUnitInfo getAuxUnitInfo() {
        return this.auxUnitInfo;
    }

    /* renamed from: b0, reason: from getter */
    public final String getPreOrderHolidayOpen() {
        return this.preOrderHolidayOpen;
    }

    /* renamed from: c, reason: from getter */
    public final String getCNCPickupDescription() {
        return this.cNCPickupDescription;
    }

    /* renamed from: c0, reason: from getter */
    public final String getPreOrderInStoreAllow() {
        return this.preOrderInStoreAllow;
    }

    /* renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: d0, reason: from getter */
    public final String getPreOrderPhone() {
        return this.preOrderPhone;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getClinic() {
        return this.clinic;
    }

    /* renamed from: e0, reason: from getter */
    public final String getPreOrderSatClose() {
        return this.preOrderSatClose;
    }

    /* renamed from: f, reason: from getter */
    public final String getCloseDate() {
        return this.closeDate;
    }

    /* renamed from: f0, reason: from getter */
    public final String getPreOrderSatOpen() {
        return this.preOrderSatOpen;
    }

    /* renamed from: g, reason: from getter */
    public final String getCurbsideAllow() {
        return this.curbsideAllow;
    }

    /* renamed from: g0, reason: from getter */
    public final String getPreOrderServiceAllow() {
        return this.preOrderServiceAllow;
    }

    /* renamed from: h, reason: from getter */
    public final String getCurbsideDriveThru() {
        return this.curbsideDriveThru;
    }

    /* renamed from: h0, reason: from getter */
    public final String getPreOrderSunClose() {
        return this.preOrderSunClose;
    }

    /* renamed from: i, reason: from getter */
    public final String getCurbsideHolidayClose() {
        return this.curbsideHolidayClose;
    }

    /* renamed from: i0, reason: from getter */
    public final String getPreOrderSunOpen() {
        return this.preOrderSunOpen;
    }

    /* renamed from: j, reason: from getter */
    public final String getCurbsideHolidayOpen() {
        return this.curbsideHolidayOpen;
    }

    /* renamed from: j0, reason: from getter */
    public final String getPreOrderWeekdayClose() {
        return this.preOrderWeekdayClose;
    }

    /* renamed from: k, reason: from getter */
    public final String getCurbsideInStoreAllow() {
        return this.curbsideInStoreAllow;
    }

    /* renamed from: k0, reason: from getter */
    public final String getPreOrderWeekdayOpen() {
        return this.preOrderWeekdayOpen;
    }

    /* renamed from: l, reason: from getter */
    public final String getCurbsidePhone() {
        return this.curbsidePhone;
    }

    /* renamed from: l0, reason: from getter */
    public final String getSPOPickupDescription() {
        return this.sPOPickupDescription;
    }

    /* renamed from: m, reason: from getter */
    public final String getCurbsideSatClose() {
        return this.curbsideSatClose;
    }

    /* renamed from: m0, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: n, reason: from getter */
    public final String getCurbsideSatOpen() {
        return this.curbsideSatOpen;
    }

    /* renamed from: n0, reason: from getter */
    public final String getStoreDirEmpId() {
        return this.storeDirEmpId;
    }

    /* renamed from: o, reason: from getter */
    public final String getCurbsideSunClose() {
        return this.curbsideSunClose;
    }

    /* renamed from: o0, reason: from getter */
    public final String getStoreDirName() {
        return this.storeDirName;
    }

    /* renamed from: p, reason: from getter */
    public final String getCurbsideSunOpen() {
        return this.curbsideSunOpen;
    }

    /* renamed from: p0, reason: from getter */
    public final String getStoreFlag() {
        return this.storeFlag;
    }

    /* renamed from: q, reason: from getter */
    public final String getCurbsideWeekdayClose() {
        return this.curbsideWeekdayClose;
    }

    /* renamed from: q0, reason: from getter */
    public final String getStoreHours() {
        return this.storeHours;
    }

    /* renamed from: r, reason: from getter */
    public final String getCurbsideWeekdayOpen() {
        return this.curbsideWeekdayOpen;
    }

    /* renamed from: r0, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: s, reason: from getter */
    public final String getDaylightSavings() {
        return this.daylightSavings;
    }

    /* renamed from: s0, reason: from getter */
    public final String getStoreSaturdayClose() {
        return this.storeSaturdayClose;
    }

    /* renamed from: t, reason: from getter */
    public final Boolean getDriveThru() {
        return this.driveThru;
    }

    /* renamed from: t0, reason: from getter */
    public final String getStoreSaturdayOpen() {
        return this.storeSaturdayOpen;
    }

    public final List<FuelPrices> u() {
        return this.fuelPrices;
    }

    /* renamed from: u0, reason: from getter */
    public final String getStoreSundayClose() {
        return this.storeSundayClose;
    }

    public final List<FulfillmentInfo> v() {
        return this.fulfillmentInfo;
    }

    /* renamed from: v0, reason: from getter */
    public final String getStoreSundayOpen() {
        return this.storeSundayOpen;
    }

    public final List<GasStationAmenities> w() {
        return this.gasStationAmenities;
    }

    /* renamed from: w0, reason: from getter */
    public final String getStoreWeekDayClose() {
        return this.storeWeekDayClose;
    }

    public final List<GasStationHours> x() {
        return this.gasStationHours;
    }

    /* renamed from: x0, reason: from getter */
    public final String getStoreWeekDayOpen() {
        return this.storeWeekDayOpen;
    }

    /* renamed from: y, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    public final List<Tenants> y0() {
        return this.tenants;
    }

    /* renamed from: z, reason: from getter */
    public final Double getLatitudeRad() {
        return this.latitudeRad;
    }

    /* renamed from: z0, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Store(List list, String str, AuxUnitInfo auxUnitInfo, List list2, List list3, List list4, String str2, String str3, String str4, int i10, Double d10, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, Double d11, Double d12, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, List list5, String str64, String str65, String str66, String str67, String str68, String str69, Double d13, Double d14, MarketAndRegions marketAndRegions, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? new AuxUnitInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null) : auxUnitInfo, (i11 & 8) != 0 ? CollectionsKt.m() : list2, (i11 & 16) != 0 ? CollectionsKt.m() : list3, (i11 & 32) != 0 ? CollectionsKt.m() : list4, (i11 & 64) != 0 ? "" : str2, (i11 & 128) != 0 ? "" : str3, (i11 & 256) != 0 ? "" : str4, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? dValueOf : d10, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str5, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str6, (i11 & 8192) != 0 ? "" : str7, (i11 & 16384) != 0 ? "" : str8, (i11 & 32768) != 0 ? "" : str9, (i11 & 65536) != 0 ? null : str10, (i11 & 131072) != 0 ? null : str11, (i11 & 262144) != 0 ? "" : str12, (i11 & 524288) != 0 ? "" : str13, (i11 & 1048576) != 0 ? Boolean.FALSE : bool, (i11 & 2097152) != 0 ? Boolean.FALSE : bool2, (i11 & 4194304) != 0 ? null : str14, (i11 & 8388608) != 0 ? null : str15, (i11 & 16777216) != 0 ? null : str16, (i11 & 33554432) != 0 ? null : str17, (i11 & 67108864) != 0 ? null : str18, (i11 & 134217728) != 0 ? null : str19, (i11 & 268435456) != 0 ? null : str20, (i11 & 536870912) != 0 ? null : str21, (i11 & 1073741824) != 0 ? null : str22, (i11 & Integer.MIN_VALUE) != 0 ? null : str23, (i12 & 1) != 0 ? null : str24, (i12 & 2) != 0 ? null : str25, (i12 & 4) != 0 ? null : str26, (i12 & 8) != 0 ? null : str27, (i12 & 16) != 0 ? "" : str28, (i12 & 32) != 0 ? "" : str29, (i12 & 64) != 0 ? "" : str30, (i12 & 128) != 0 ? "" : str31, (i12 & 256) != 0 ? "" : str32, (i12 & 512) != 0 ? dValueOf : d11, (i12 & 1024) != 0 ? dValueOf : d12, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str33, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str34, (i12 & 8192) != 0 ? null : str35, (i12 & 16384) != 0 ? null : str36, (i12 & 32768) != 0 ? null : str37, (i12 & 65536) != 0 ? null : str38, (i12 & 131072) != 0 ? null : str39, (i12 & 262144) != 0 ? "" : str40, (i12 & 524288) != 0 ? "" : str41, (i12 & 1048576) != 0 ? "" : str42, (i12 & 2097152) != 0 ? "" : str43, (i12 & 4194304) != 0 ? "" : str44, (i12 & 8388608) != 0 ? "" : str45, (i12 & 16777216) != 0 ? null : str46, (i12 & 33554432) != 0 ? null : str47, (i12 & 67108864) != 0 ? null : str48, (i12 & 134217728) != 0 ? null : str49, (i12 & 268435456) != 0 ? null : str50, (i12 & 536870912) != 0 ? null : str51, (i12 & 1073741824) != 0 ? null : str52, (i12 & Integer.MIN_VALUE) != 0 ? null : str53, (i13 & 1) != 0 ? "" : str54, (i13 & 2) != 0 ? "" : str55, (i13 & 4) != 0 ? null : str56, (i13 & 8) != 0 ? null : str57, (i13 & 16) != 0 ? null : str58, (i13 & 32) != 0 ? null : str59, (i13 & 64) != 0 ? null : str60, (i13 & 128) != 0 ? null : str61, (i13 & 256) != 0 ? null : str62, (i13 & 512) != 0 ? null : str63, (i13 & 1024) != 0 ? CollectionsKt.m() : list5, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str64, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str65, (i13 & 8192) != 0 ? "" : str66, (i13 & 16384) == 0 ? str67 : null, (i13 & 32768) != 0 ? "" : str68, (i13 & 65536) == 0 ? str69 : "", (i13 & 131072) != 0 ? dValueOf : d13, (i13 & 262144) != 0 ? dValueOf : d14, (i13 & 524288) != 0 ? new MarketAndRegions(null, null, null, null, 15, null) : marketAndRegions);
    }
}
