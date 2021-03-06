// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildcontroller._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildcontroller._03._BuildControllerWebServiceSoap_RemoveRun;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildControllerWebServiceSoap_RemoveRun
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String buildUri;
    protected String runId;

    public _BuildControllerWebServiceSoap_RemoveRun()
    {
        super();
    }

    public _BuildControllerWebServiceSoap_RemoveRun(
        final String buildUri,
        final String runId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBuildUri(buildUri);
        setRunId(runId);
    }

    public String getBuildUri()
    {
        return this.buildUri;
    }

    public void setBuildUri(String value)
    {
        this.buildUri = value;
    }

    public String getRunId()
    {
        return this.runId;
    }

    public void setRunId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'runId' is a required element, its value cannot be null");
        }

        this.runId = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "buildUri",
            this.buildUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "runId",
            this.runId);

        writer.writeEndElement();
    }
}
