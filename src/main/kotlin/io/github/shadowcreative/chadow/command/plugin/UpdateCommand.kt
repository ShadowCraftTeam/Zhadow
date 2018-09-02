/*
Copyright (c) 2018 ruskonert
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package io.github.shadowcreative.chadow.command.plugin

import io.github.shadowcreative.chadow.command.RuskitCommand
import org.bukkit.command.CommandSender

open class UpdateCommand : RuskitCommand<UpdateCommand>("update")
{
    init
    {
        this.setCommandDescription("update the {plugin_name}")
        this.setPermission("update")
        this.setDefaultOP(true)
        this.setDefaultUser(false)
    }

    override fun perform(sender: CommandSender, argc: Int, argv: List<String>?, handleInstance: Any?): Any? {
        return true
    }
}