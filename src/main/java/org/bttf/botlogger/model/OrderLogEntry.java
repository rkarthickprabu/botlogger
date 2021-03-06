package org.bttf.botlogger.model;

import lombok.Data;

@Data
public class OrderLogEntry {

    /* Example raw JSON:

            { conversationId: 'm4lg0ia6a43',
          channel: 'emulator',
          lastUserMessage: 'microsoft',
          lastOrderState:
           { stock: 'Microsoft',
             qty: 50000,
             direction: 'Sell',
             completed: true },
          lastSystemMessage: 'How many Microsoft would you like to order?',
          choices: [] }

     */

    public String conversationId;
    public String channel;
    public String lastUserMessage;
    public OrderState lastOrderState;
    public String lastSystemMessage;
    public String[] choices;

}
