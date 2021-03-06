// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._TestResultData;

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
public class _TestResultData
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String runId;
    protected String name;
    protected String runUser;
    protected int testsTotal;
    protected int testsPassed;
    protected int testsFailed;
    protected boolean runPassed;

    public _TestResultData()
    {
        super();
    }

    public _TestResultData(
        final String runId,
        final String name,
        final String runUser,
        final int testsTotal,
        final int testsPassed,
        final int testsFailed,
        final boolean runPassed)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRunId(runId);
        setName(name);
        setRunUser(runUser);
        setTestsTotal(testsTotal);
        setTestsPassed(testsPassed);
        setTestsFailed(testsFailed);
        setRunPassed(runPassed);
    }

    public String getRunId()
    {
        return this.runId;
    }

    public void setRunId(String value)
    {
        this.runId = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String value)
    {
        this.name = value;
    }

    public String getRunUser()
    {
        return this.runUser;
    }

    public void setRunUser(String value)
    {
        this.runUser = value;
    }

    public int getTestsTotal()
    {
        return this.testsTotal;
    }

    public void setTestsTotal(int value)
    {
        this.testsTotal = value;
    }

    public int getTestsPassed()
    {
        return this.testsPassed;
    }

    public void setTestsPassed(int value)
    {
        this.testsPassed = value;
    }

    public int getTestsFailed()
    {
        return this.testsFailed;
    }

    public void setTestsFailed(int value)
    {
        this.testsFailed = value;
    }

    public boolean isRunPassed()
    {
        return this.runPassed;
    }

    public void setRunPassed(boolean value)
    {
        this.runPassed = value;
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
            "RunId",
            this.runId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Name",
            this.name);
        XMLStreamWriterHelper.writeElement(
            writer,
            "RunUser",
            this.runUser);
        XMLStreamWriterHelper.writeElement(
            writer,
            "TestsTotal",
            this.testsTotal);
        XMLStreamWriterHelper.writeElement(
            writer,
            "TestsPassed",
            this.testsPassed);
        XMLStreamWriterHelper.writeElement(
            writer,
            "TestsFailed",
            this.testsFailed);
        XMLStreamWriterHelper.writeElement(
            writer,
            "RunPassed",
            this.runPassed);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("RunId"))
                {
                    this.runId = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Name"))
                {
                    this.name = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("RunUser"))
                {
                    this.runUser = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("TestsTotal"))
                {
                    this.testsTotal = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("TestsPassed"))
                {
                    this.testsPassed = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("TestsFailed"))
                {
                    this.testsFailed = XMLConvert.toInt(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("RunPassed"))
                {
                    this.runPassed = XMLConvert.toBoolean(reader.getElementText());
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
